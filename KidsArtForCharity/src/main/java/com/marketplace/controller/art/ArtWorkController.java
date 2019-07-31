package com.marketplace.controller.art;

import java.io.IOException;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.marketplace.model.art.ArtWork;
import com.marketplace.service.art.ArtWorkService;
@Controller
@RequestMapping(value="art")
public class ArtWorkController {
	@Autowired(required = true)
	@Qualifier(value="artWorkService")
    ArtWorkService artWorkService;
	@RequestMapping(value="saveArtWork", method=RequestMethod.POST)
	public String saveArtWork( @ModelAttribute("artWork") ArtWork artWork, Model model,@RequestParam("file") MultipartFile file) {
			try {
				artWork.setImagefile(file.getBytes());
				artWorkService.saveArtWork(artWork);
				List<ArtWork> artWorks=artWorkService.getArtWorkByArtistId(artWork.getArtist().getArtistid());
				if(artWorks!=null && !artWorks.isEmpty()) {
					Iterator<ArtWork> itr = artWorks.iterator();
					while(itr.hasNext()) {
						ArtWork art = itr.next();
						art.setBase64Image(Base64.getEncoder().encodeToString(art.getImagefile()));
					}
				}
				model.addAttribute("artWorks", artWorks);
				model.addAttribute("message", "Listing created Successfully");
			} catch (IOException e) {
				return "error";
			}
			return "listingSuccess";
	}
}
