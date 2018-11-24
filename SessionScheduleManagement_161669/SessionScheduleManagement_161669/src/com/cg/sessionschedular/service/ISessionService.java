package com.cg.sessionschedular.service;

import java.util.ArrayList;



import com.cg.sessionschedular.model.Session;

public interface ISessionService {

	public ArrayList<Session> getSessionDetails();

	public String getSessionName();

}
