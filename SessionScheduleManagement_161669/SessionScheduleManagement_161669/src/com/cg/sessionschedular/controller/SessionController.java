package com.cg.sessionschedular.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;








import com.cg.sessionschedular.exception.SessionException;
import com.cg.sessionschedular.model.Session;
import com.cg.sessionschedular.service.ISessionService;

/*Author:Sai Priya
 * 
 * This is a Controller class */
@Controller
public class SessionController {

	@Autowired
	ISessionService service;


	@RequestMapping("/home")
	public String displayPage(Model model) {
		
		
		String view = "ScheduledSessions";
		ArrayList<Session> list = service.getSessionDetails();
		model.addAttribute("sessionlist", list);
		return view;
		
		
		
	}

	@RequestMapping("/enroll")
	public String bookingPage(Model model) {
		String view = "";
		String name = service.getSessionName();
		model.addAttribute("name", name);
		view = "Success";
		return view;
	}
}
