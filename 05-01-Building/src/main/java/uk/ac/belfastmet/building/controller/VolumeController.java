package uk.ac.belfastmet.building.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.building.domain.Volume;
import uk.ac.belfastmet.building.service.VolumeService;

@Controller
@RequestMapping("/volume")
public class VolumeController {
	
	@GetMapping("")
	public String siteroot(Model model) {
		
		VolumeService vService = new VolumeService();
		ArrayList<Volume> volBuilding = vService.getBuildingVolume();
		
		model.addAttribute("pageTitle", "Volume");
		model.addAttribute("vService", volBuilding);
		return "volume.html";
		
	}

}
