package com.marketplace.service.art;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.marketplace.dao.art.ArtWorkDAO;
import com.marketplace.model.art.ArtWork;

public class ArtWorkServiceImpl implements ArtWorkService {
	@Autowired
	private ArtWorkDAO artWorkDAO;

	@Override
	public void saveArtWork(ArtWork artWork) {
		this.artWorkDAO.saveArtWork(artWork);

	}

	public ArtWorkDAO getArtWorkDAO() {
		return artWorkDAO;
	}

	public void setArtWorkDAO(ArtWorkDAO artWorkDAO) {
		this.artWorkDAO = artWorkDAO;
	}

	@Override
	public List<ArtWork> getArtWorkByUserId(Long userId) {
		return this.artWorkDAO.getArtWorkByUserId(userId);
	}

	@Override
	public List<ArtWork> getArtWorkByArtistId(Long artistId) {
		return this.artWorkDAO.getArtWorkByArtistId(artistId);
	}

	@Override
	public ArtWork getArtWorkById(Long id) {
		
		return this.artWorkDAO.getArtWorkById(id);
	}

}
