package com.cg.hotelbooking.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class HotelDetails {
	
	@Id
	@Column(name = "Hotel_Id")
	private Integer hotelId;
	
	@Column(name="Hotel_Name")
	private String hotelName;
	
	@Column(name="Hotel_Rating")
	private Integer hotelRating;
	
	@Column(name="Hotel_Rate")
	private Double hotelRate;
	
	@Column(name="Room_Available")
	private Integer roomAvailable;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="customerId")
	private BookingDetails bookingDetails;

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(Integer hotelRating) {
		this.hotelRating = hotelRating;
	}

	public Double getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(Double hotelRate) {
		this.hotelRate = hotelRate;
	}

	public Integer getRoomAvailable() {
		return roomAvailable;
	}

	public void setRoomAvailable(Integer roomAvailable) {
		this.roomAvailable = roomAvailable;
	}

	@Override
	public String toString() {
		return "HotelDetails [hotelId=" + hotelId + ", hotelName=" + hotelName
				+ ", hotelRating=" + hotelRating + ", hotelRate=" + hotelRate
				+ ", roomAvailable=" + roomAvailable + ", bookingDetails="
				+ bookingDetails + "]";
	}

}
