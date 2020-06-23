package com.PersonalWebProjects.AngularEvents.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.PersonalWebProjects.AngularEvents.Repository.*;
import com.PersonalWebProjects.AngularEvents.Entity.*;

@RestController
public class EventsController {
	private EventsRepository eventsRepo;

	EventsController(EventsRepository eventsRepo)
	{
		this.eventsRepo = eventsRepo;
	}
@GetMapping("/api/angularevents/events")
public List<Events> getEvents()
{
		return eventsRepo.findAll();
}

@GetMapping("/api/angularevents/events/{id}")
public Events getUsersById(@PathVariable("id")Integer eventid)
{
	System.out.print("this is "+eventid);
Events event =eventsRepo.findById(eventid).get();
return event;
}
}
