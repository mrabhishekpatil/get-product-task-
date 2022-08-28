package com.product.ppp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class charges_per_categery {
	
	@Id
	int  Product_ID;
	
 private String Product_Category;
 private double Discount;
 private double GST;
 private double Delivey_Charge;
	public charges_per_categery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public charges_per_categery(String product_Category, double discount, double gST, double delivey_Charge) {
		super();
		Product_Category = product_Category;
		Discount = discount;
		GST = gST;
		Delivey_Charge = delivey_Charge;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public double getGST() {
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}
	public double getDelivey_Charge() {
		return Delivey_Charge;
	}
	public void setDelivey_Charge(double delivey_Charge) {
		Delivey_Charge = delivey_Charge;
	}
	@Override
	public String toString() {
		return "charges_per_categery [Product_Category=" + Product_Category + ", Discount=" + Discount + ", GST=" + GST
				+ ", Delivey_Charge=" + Delivey_Charge + "]";
	}
	
	
	
	
	

}
