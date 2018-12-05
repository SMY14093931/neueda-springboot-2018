package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class PassengerController {
	
	PassengerRepository passengerRepository;

	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	

	@GetMapping("/passenger")
	public String root(Model model) {
		
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerRepository.findAll());	
//		model.addAttribute("passengers",this.passengerRepository.findByPassengerId(1));	
		return "passengersPage";
		
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passenger ID");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		return "passengersPage";
	}
	
	@PostMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle", "Passengers by Name");
		model.addAttribute("passengers", this.passengerRepository.findByNameContaining(name));
		return "passengersPage";
	}

	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle", "Passengers by Gender");
		model.addAttribute("passengers", this.passengerRepository.findBySex(sex));
		return "passengersPage";
	}
	
	@GetMapping("/searchnamesex")
	public String searchNameAuthor(@RequestParam("name") String name, @RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerRepository.findByNameContainingAndSex(name, sex));
		return "passengersPage";
	}
}

