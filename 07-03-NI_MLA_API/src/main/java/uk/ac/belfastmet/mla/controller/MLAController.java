package uk.ac.belfastmet.mla.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.mla.domain.AllMembersAPI;
import uk.ac.belfastmet.mla.domain.AllMembersList;
import uk.ac.belfastmet.mla.domain.Member;

@Controller
@RequestMapping
public class MLAController {
	
	@GetMapping("")
	public String home() {
		
		String allMembersForConstituency1Url = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		RestTemplate restTemplate = new RestTemplate();
		
		AllMembersAPI allMembersAPI = restTemplate.getForObject(allMembersForConstituency1Url, AllMembersAPI.class);
		AllMembersList allMembersList = allMembersAPI.getAllMembersList();
		Member member = (Member) allMembersList.getAllMembersList().get(0);
		
		Logger logger = LoggerFactory.getLogger(MLAController.class);
		logger.info(member.toString());
		return "home";
	}
	

}
