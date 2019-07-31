package com.marketplace.service.art;

import java.util.List;

import com.marketplace.model.art.ArtWork;
import com.marketplace.model.art.Artist;

public interface ArtistService {


	public List<Artist> listAllArtists();
	public List<Artist> getArtistByName(String name);
	public Artist getArtistById(int id);
	public void save(Artist artist);
	public List<Artist> getArtistByUserId(Long userid);
	public void saveArtWork(ArtWork artWork);
}
