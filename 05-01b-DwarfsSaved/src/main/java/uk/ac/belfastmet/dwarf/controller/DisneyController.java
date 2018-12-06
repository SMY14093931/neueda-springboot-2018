package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;

@Controller
@RequestMapping("/disney")
public class DisneyController {
	
	DwarfRepository dwarfRepository;
	
	
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}



	@GetMapping("")
	public String root(Model model) {
	
		
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("dwarfs",this.dwarfRepository.findByAuthor("Disney"));	
		return "dwarfPage";
		
	}

}
