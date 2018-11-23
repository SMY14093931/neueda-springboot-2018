package uk.ac.belfastmet.building.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.building.domain.FloorArea;
import uk.ac.belfastmet.building.service.FloorAreaService;

@Controller
@RequestMapping("/floorarea")
public class FloorAreaController {
	
	@GetMapping("")
	public String root(Model model) {
		
		FloorAreaService faService = new FloorAreaService();
		ArrayList<FloorArea> fabuilding = faService.getFABuilding();
		
		model.addAttribute("pageTitle", "Floor Area");
		model.addAttribute("fabuilding", fabuilding);
		model.addAttribute("locationFrame","<iframe src=\"https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d2457411.57032683!2d-7.116919526222024!3d53.02367081219813!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e6!4m0!4m5!1s0x486109b027638971%3A0x4c25729beb967212!2stitanic+museum!3m2!1d54.607937199999995!2d-5.9097953!5e0!3m2!1sen!2suk!4v1542900908771\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		return "floorarea.html";
		
	}

}
