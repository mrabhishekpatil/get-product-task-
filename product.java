package com.product.ppp;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class product  {
	
	@Id
	private int Product_ID;
	private String Product_Name;
	private String Product_Type;
	private String Product_Category;
	private double Product_Price;
	
	public product() {
		super();
		
	}
	public product(int product_ID, String product_Name, String product_Type, String product_Category,
			double product_Price) {
		super();
		Product_ID = product_ID;
		Product_Name = product_Name;
		Product_Type = product_Type;
		Product_Category = product_Category;
		Product_Price = product_Price;
		
	}
	public int getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Type() {
		return Product_Type;
	}
	public void setProduct_Type(String product_Type) {
		Product_Type = product_Type;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}
	public double getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}
	@Override
	public String toString() {
		return "product [Product_ID=" + Product_ID + ", Product_Name=" + Product_Name + ", Product_Type=" + Product_Type
				+ ", Product_Category=" + Product_Category + ", Product_Price=" + Product_Price + "]";
	}
	
	
	
	

	
	
	
}
