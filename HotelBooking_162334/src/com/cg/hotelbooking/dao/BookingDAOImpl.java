package com.cg.hotelbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hotelbooking.dto.HotelDetails;

@Repository("bookingDAO")
public class BookingDAOImpl implements IBoookingDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<HotelDetails> allHotelDetails() {
		
		Query query= entityManager.createQuery("SELECT h FROM HotelDetails h");
		
		List<HotelDetails> hotellist = query.getResultList();
		
		return hotellist;
	}

	@Override
	public String bookHotel() {
		Query query = entityManager.createQuery("from HotelDetails");
		String hotelname= (String) query.getSingleResult();
		return hotelname;
	}

}
