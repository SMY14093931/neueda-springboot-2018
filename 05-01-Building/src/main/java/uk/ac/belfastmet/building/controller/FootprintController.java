package uk.ac.belfastmet.building.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.building.domain.Footprint;
import uk.ac.belfastmet.building.service.FootprintService;

@Controller
@RequestMapping("/footprint")
public class FootprintController {
	
	@GetMapping("")
	public String siteroot(Model model) {
		
		FootprintService fpService = new FootprintService();
		ArrayList<Footprint> fpBuilding = fpService.getBuildingFootprint();
		
		model.addAttribute("pageTitle", "Footprint");
		model.addAttribute("fpService", fpBuilding);
		
		return "footprint.html";
	}
	

}
