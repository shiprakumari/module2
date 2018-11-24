package com.cg.sessionschedular.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;



import com.cg.sessionschedular.model.Session;

@Repository
public class SessionDaoImpl implements ISessionDAO {

	@PersistenceContext
	EntityManager manager;


	@Override
	public ArrayList<Session> getSessionDetails() {
		// TODO Auto-generated method stub
		ArrayList<Session> list = new ArrayList<>();
		String jpql = "Select sess from Session sess";
		TypedQuery<Session> query = manager.createQuery(jpql, Session.class);
		list = (ArrayList<Session>) query.getResultList();
		return list;
	}
	

	@Override
	public String getSessionName() {
		// TODO Auto-generated method stub
		String jpql ="Select sess.name from Session sess where sess.id = 1";
		TypedQuery<String> query = manager.createQuery(jpql,String.class);
		String sessionName = query.getSingleResult();
		return sessionName;
	}
}
