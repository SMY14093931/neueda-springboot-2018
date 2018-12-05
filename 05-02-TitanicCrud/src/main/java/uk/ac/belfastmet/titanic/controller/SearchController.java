package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class SearchController {
	
	PassengerRepository passengerRepository;
	
	public SearchController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	

	@GetMapping("view/{passengerId}")
	public String viewDwarf(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
	
		return "viewPassengers";
	}
	
	@GetMapping("delete/{passengerId}")
	public String deleteDwarf(@PathVariable("passengerId") Integer passengerId, Model model, 
			RedirectAttributes redirectAttributes) {
		this.passengerRepository.deleteById(passengerId);
		redirectAttributes.addFlashAttribute("message", "Passenger Deleted Successfully");
		return "redirect:/passenger";
	}

}
