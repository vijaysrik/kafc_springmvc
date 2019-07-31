package com.marketplace.service.art;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.marketplace.dao.art.ArtistDAO;
import com.marketplace.model.art.ArtWork;
import com.marketplace.model.art.Artist;

public class ArtistServiceImpl implements ArtistService {
	@Autowired
	private ArtistDAO artistDAO;
	@Override
	public List<Artist> listAllArtists() {
		return artistDAO.listAllArtists();
	}

	@Override
	public List<Artist> getArtistByName(String name) {
		return artistDAO.getArtistByName(name);
	}

	@Override
	public Artist getArtistById(int id) {
		return artistDAO.getArtistById(id);
	}

	@Override
	public void save(Artist artist) {
		 artistDAO.save(artist);

	}

	public ArtistDAO getArtistDAO() {
		return artistDAO;
	}

	public void setArtistDAO(ArtistDAO artistDAO) {
		this.artistDAO = artistDAO;
	}
	
	@Override
	public List<Artist> getArtistByUserId(Long userid){
		return this.artistDAO.getArtistByUserId(userid);
	}

	@Override
	public void saveArtWork(ArtWork artWork) {
		this.artistDAO.saveArtWork(artWork);
		
	}
}
