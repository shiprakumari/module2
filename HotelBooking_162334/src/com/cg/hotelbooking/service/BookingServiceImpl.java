package com.cg.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hotelbooking.dao.IBoookingDAO;
import com.cg.hotelbooking.dto.HotelDetails;
@Service("bookingService")
@Transactional
public class BookingServiceImpl implements IBookingService {
	@Autowired
	IBoookingDAO bookingDAO;

	@Override
	public List<HotelDetails> allHotelDetails() {
		// TODO Auto-generated method stub
		return bookingDAO.allHotelDetails();
	}

	@Override
	public String bookHotel() {
		// TODO Auto-generated method stub
		return bookingDAO.bookHotel();
	}

}
