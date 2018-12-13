package uk.ac.belfastmet.mla.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member")
	//ArrayList<Object> allMembersList;
	ArrayList<Member> allMembersList;

	public String toString() {
		return this.allMembersList.toString();
	}

}
