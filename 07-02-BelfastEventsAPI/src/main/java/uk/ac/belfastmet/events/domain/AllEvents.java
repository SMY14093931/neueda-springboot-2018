package uk.ac.belfastmet.events.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AllEvents {
	
	private ArrayList<Events> allEvents;
	
	public Events getEventWithId(String identifier) {
		for (int i = 0; i< this.allEvents.size(); i++) {
			Events currentEvent = this.allEvents.get(i);
			if( currentEvent.getIdentifier().equals(identifier) ) {
				return currentEvent;
			}
		}
		return null;
	}


}
