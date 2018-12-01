package com.cg.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hotelbooking.dto.HotelDetails;
import com.cg.hotelbooking.service.IBookingService;


@Controller
public class BookingController {
	@Autowired
	IBookingService bookingService;
	
	@RequestMapping(value="hoteldetails")
	public ModelAndView getAllHotels(){
		List<HotelDetails> hotels = bookingService.allHotelDetails();
		
		return new ModelAndView("hoteldetails","temp",hotels);
		
	}
	@RequestMapping(value="book")
	public ModelAndView getName(@RequestParam("name") String hotelName){
		
		return new ModelAndView("success","hotel",hotelName);
		
	}
	
	

}
