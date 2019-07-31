package com.marketplace.dao.art;

import java.util.List;

import com.marketplace.model.art.ArtWork;
import com.marketplace.model.art.Artist;

public interface ArtistDAO {
	public List<Artist> listAllArtists();
	public List<Artist> getArtistByName(String name);
	public Artist getArtistById(int id);
	public void save(Artist artist);
	public List<Artist> getArtistByUserId(Long id);
	public void saveArtWork(ArtWork artWork);
	

}
