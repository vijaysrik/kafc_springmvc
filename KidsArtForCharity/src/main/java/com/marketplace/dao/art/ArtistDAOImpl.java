package com.marketplace.dao.art;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marketplace.model.art.ArtWork;
import com.marketplace.model.art.Artist;
@Repository
@Transactional
public class ArtistDAOImpl implements ArtistDAO {
	
	private SessionFactory sessionFactory;
	@Autowired
	public ArtistDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Artist> listAllArtists() {
		List<Artist> artists=null;
		Session session=this.sessionFactory.getCurrentSession();
	    artists=session.createQuery("from artist").list();
		return artists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Artist> getArtistByName(String name) {
		String hql="from Artist a where a.name='" + name +"'";
		Session session=this.sessionFactory.getCurrentSession();
	    List<Artist> artists=session.createQuery(hql).list();
	   
		return artists;
	}

	@Override
	public Artist getArtistById(int id) {
		Artist artist = new Artist();
		Session session=this.sessionFactory.getCurrentSession();
		session.load(artist, id);
		return artist;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Artist> getArtistByUserId(Long id) {
		List<Artist> artists ;
		Session session=this.sessionFactory.getCurrentSession();
		String hql= "from Artist a where a.userid="+id; 
		artists=session.createQuery(hql).list();
		return artists;
	}
	
	@Override
	public void save(Artist artist) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(artist);	
		Set<ArtWork> artWorks = artist.getArtworks();
		if(artWorks!=null) {
			Iterator<ArtWork> iterator =(Iterator<ArtWork>)artWorks.iterator();
			if(iterator.hasNext()) {
			session.save(iterator.next());
			}
		}
	}

	@Override
	public void saveArtWork(ArtWork artWork) {
		Session session =this.sessionFactory.getCurrentSession();
		session.save(artWork);
		
	}

}
