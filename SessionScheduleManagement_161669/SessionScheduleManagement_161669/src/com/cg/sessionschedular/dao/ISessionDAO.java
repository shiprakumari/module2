package com.cg.sessionschedular.dao;

import java.util.ArrayList;



import com.cg.sessionschedular.model.Session;

public interface ISessionDAO {
	public ArrayList<Session> getSessionDetails();

	public String getSessionName();
}
