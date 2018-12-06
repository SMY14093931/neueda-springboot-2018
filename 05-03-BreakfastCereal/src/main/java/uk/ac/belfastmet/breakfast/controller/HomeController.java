package uk.ac.belfastmet.breakfast.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.breakfast.domain.Cereal;
import uk.ac.belfastmet.breakfast.repository.CerealRepository;

@Controller
@RequestMapping("")
public class HomeController {
	
	CerealRepository cerealRepository;

	public HomeController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	@GetMapping("")
	public String root(Model model) {
		
		model.addAttribute("pageTitle", "Cereals");
		model.addAttribute("cereals", this.cerealRepository.findAll());	
		return "homePage";
		
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Cereal ID");
		model.addAttribute("cereals", this.cerealRepository.findByCerealId(cerealId));
		return "cerealsPage";
	}
	
	@PostMapping("/searchcereal")
	public String searchName(@RequestParam("cereal") String cereal, Model model) {
		model.addAttribute("pageTitle", "Cereals by Name");
		model.addAttribute("cereals", this.cerealRepository.findByCerealContaining(cereal));
		return "cerealsPage";
	}
	
	@GetMapping("/add")
	public String addCereal(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";
	}
	
	@GetMapping("/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "editCereal";
	}
	
	@PostMapping("/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
			return "editCereal";
		} else {
			Cereal savedCereal = this.cerealRepository.save(cereal);
			return "redirect:/view/"+cereal.getCerealId();
		}
	}
	
	@GetMapping("view/{cerealId}")
	public String viewDwarf(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
	
		return "viewCereal";
	}
	
	@GetMapping("delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, Model model,RedirectAttributes redirectAttributes) {
		this.cerealRepository.deleteById(cerealId);
		redirectAttributes.addFlashAttribute("message", "Cereal Deleted Successfully");
		return "redirect:/cereal";
	}
	
	

}

