package com.product.ppp;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;


public class charges  {
	private double gst;
	private double delivery;
	public charges() {
		super();
		// TODO Auto-generated constructor stub
	}
	public charges(double gst, double delivery) {
		super();
		this.gst = gst;
		this.delivery = delivery;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "charges [gst=" + gst + ", delivery=" + delivery + "]";
	}
	
	
	

}
