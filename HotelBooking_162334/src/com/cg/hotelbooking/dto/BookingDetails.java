package com.cg.hotelbooking.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
public class BookingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer customerId;
	private String customerName;
	private Date todate;
	private Date fromDate;
	private Integer noOfRooms;


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Date getTodate() {
		return todate;
	}


	public void setTodate(Date todate) {
		this.todate = todate;
	}


	public Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	public Integer getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}



	@Override
	public String toString() {
		return "BookingDetails [customerId=" + customerId + ", customerName="
				+ customerName + ", todate=" + todate + ", fromDate="
				+ fromDate + ", noOfRooms=" + noOfRooms+"]";
	}
	
	

}
