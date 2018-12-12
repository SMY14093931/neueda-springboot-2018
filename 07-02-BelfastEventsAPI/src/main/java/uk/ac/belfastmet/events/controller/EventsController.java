package uk.ac.belfastmet.events.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;

@Controller
@RequestMapping()
public class EventsController {
	
	@GetMapping("")
	public String home() {
		return "home";
	}
	
	@GetMapping("/events")
	public String belfastevent(Model model) {
		
		//build for belfastevents
		String EventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(EventsUrl, AllEvents.class);
		
		//slf4j
		Logger logger = LoggerFactory.getLogger(AllEvents.class);
		logger.info(allEvents.getAllEvents().toString());	
		logger.info(allEvents.getAllEvents().toString());
		logger.info(allEvents.getAllEvents().toString());
		System.out.println(allEvents.getAllEvents().get(0));
				
		model.addAttribute("events",allEvents.getAllEvents());
		return "events";
	}

}
