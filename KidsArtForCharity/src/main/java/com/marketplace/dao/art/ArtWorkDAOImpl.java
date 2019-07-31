package com.marketplace.dao.art;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marketplace.model.art.ArtWork;

@Repository
@Transactional
public class ArtWorkDAOImpl implements ArtWorkDAO {
	private SessionFactory sessionFactory;
	@Autowired	
	public ArtWorkDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
	}
	@Override
	public void saveArtWork(ArtWork artWork) {
		Session session =this.sessionFactory.getCurrentSession();
		session.save(artWork);
	}

	@Override
	public List<ArtWork> getArtWorkByUserId(Long userId) {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArtWork> getArtWorkByArtistId(Long artistId) {
		String hql= "from ArtWork a where a.artist.artistid="+artistId;
		Session session =this.sessionFactory.getCurrentSession();
		List<ArtWork> artWorks=(List<ArtWork>)session.createQuery(hql).list();
		return artWorks;
	}
	
	@Override
	public ArtWork getArtWorkById(Long id) {
		String hql= "from ArtWork a where a.id="+id;
		Session session =this.sessionFactory.getCurrentSession();
		ArtWork artWork=(ArtWork)session.createQuery(hql).list();
		return artWork;
	}

}
