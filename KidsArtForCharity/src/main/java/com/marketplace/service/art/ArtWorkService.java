package com.marketplace.service.art;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marketplace.model.art.ArtWork;
@Service
@Component
public interface ArtWorkService {
	public void saveArtWork(ArtWork artWork) ;
	public List<ArtWork> getArtWorkByUserId(Long userId);
	public List<ArtWork> getArtWorkByArtistId(Long artistId);
	public ArtWork getArtWorkById(Long id);
}
