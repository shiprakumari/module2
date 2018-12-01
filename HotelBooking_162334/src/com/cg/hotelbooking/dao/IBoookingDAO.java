package com.cg.hotelbooking.dao;

import java.util.List;

import com.cg.hotelbooking.dto.HotelDetails;

public interface IBoookingDAO {
	public List<HotelDetails> allHotelDetails();
	public String bookHotel();
}
