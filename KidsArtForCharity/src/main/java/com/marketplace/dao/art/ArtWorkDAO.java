package com.marketplace.dao.art;

import java.util.List;

import com.marketplace.model.art.ArtWork;

public interface ArtWorkDAO {
	public void saveArtWork(ArtWork artWork);
	 public List<ArtWork> getArtWorkByUserId(Long userId);
	 public List<ArtWork> getArtWorkByArtistId(Long artistId);
	 public ArtWork getArtWorkById(Long id);
}
