package com.cg.sessionschedular.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.sessionschedular.dao.ISessionDAO;
import com.cg.sessionschedular.model.Session;

@Service
@Transactional
public class SessionServiceImpl implements ISessionService{

	@Autowired
	ISessionDAO sessionDao;
	
	
	@Override
	public ArrayList<Session> getSessionDetails() {
		// TODO Auto-generated method stub
		return sessionDao.getSessionDetails();
	}

	@Override
	public String getSessionName() {
		// TODO Auto-generated method stub
		return sessionDao.getSessionName();
	}

}
