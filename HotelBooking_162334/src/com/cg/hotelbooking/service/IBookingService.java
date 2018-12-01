package com.cg.hotelbooking.service;

import java.util.List;

import com.cg.hotelbooking.dto.HotelDetails;

public interface IBookingService {
	public List<HotelDetails> allHotelDetails();
	public String bookHotel();

}
