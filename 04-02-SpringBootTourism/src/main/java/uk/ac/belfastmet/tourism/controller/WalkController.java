package uk.ac.belfastmet.tourism.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.tourism.domain.Tourism;
import uk.ac.belfastmet.tourism.service.TourismService;

@Controller
@RequestMapping("/walk")
public class WalkController {
	
	@GetMapping("")
	public String walkroot(Model model) {
		
		TourismService touristService = new TourismService();
		ArrayList<Tourism> walkTours = touristService.getWalkTours();
		
		model.addAttribute("pageTitle", "Walk");
		model.addAttribute("walkTours", walkTours);
		return "site.html";

}
	
}
