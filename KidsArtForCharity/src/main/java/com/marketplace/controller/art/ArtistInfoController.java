package com.marketplace.controller.art;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.marketplace.model.art.ArtWork;
import com.marketplace.model.art.Artist;
import com.marketplace.model.user.User;
import com.marketplace.service.art.ArtistService;

@Controller
@RequestMapping(value="art")
public class ArtistInfoController {
	@Autowired(required = true)
	@Qualifier(value="artistService")
	ArtistService artistService;
	
	@RequestMapping(value="saveArtist", method=RequestMethod.POST)
	public String saveArtist(@SessionAttribute("loggedInUser") User loggedInUser, @ModelAttribute("artist") Artist artist, Model model) {

		artist.setUserid(loggedInUser.getUserid());
		artistService.save(artist);

		model.addAttribute("message", "Artist Profile created successfully!");
		return "registerArtist";
	}

	
    @RequestMapping(value="displayRegisterArtist", method=RequestMethod.GET)
    public String displayCreateArtist(Model model) {
  
    	model.addAttribute("artist", new Artist());
    	return "registerArtist";
    	
    }
    
    @RequestMapping(value="displayListingForm", method= RequestMethod.GET)
    public String displayListingForm(HttpServletRequest request,Model model) {
    	User loggedInUser= (User)request.getSession().getAttribute("loggedInUser");
    	List<Artist> artists = fetchArtistsByUserId(loggedInUser.getUserid());
    	Map<Long,String> artistList = new HashMap<Long, String>();
    	
    	Iterator<Artist> itr = artists.iterator();
    	while(itr.hasNext()) {
    		Artist a=(Artist)itr.next();
    		artistList.put(a.getArtistid(),a.getName());
    		System.out.println(a.getName() + " " + a.getProfile()+" "+a.getArtistid());
    	}
    	model.addAttribute("artistList",artistList);
    	ArtWork artWork = new ArtWork();
    	artWork.setArtist(new Artist());
    	model.addAttribute("artWork", artWork);
    	return "registerListing";
    }

	private List<Artist> fetchArtistsByUserId(Long userid) {
		return this.artistService.getArtistByUserId(userid);
	}
}
