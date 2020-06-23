package com.PersonalWebProjects.AngularEvents.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PersonalWebProjects.AngularEvents.Repository.*;
import com.PersonalWebProjects.AngularEvents.Entity.*;

@RestController
public class SessionsController {
	@Autowired
	private SessionsRepository sessionsRepo;
@GetMapping("/api/angularevents/sessions")
public List<Sessions> getSessions()
{

	return sessionsRepo.findAll();
}
}
