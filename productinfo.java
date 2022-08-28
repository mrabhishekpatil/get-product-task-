package com.product.ppp;

import org.springframework.stereotype.Component;

@Component
public class productinfo {
	
	private int productId;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	private double discount;
	private charges charges;
	private double finalPrice;
	public productinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public productinfo(int productId, String name, String productType, String category, double basePrice,
			double discount, com.product.ppp.charges charges, double finalPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.discount = discount;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public charges getCharges() {
		return charges;
	}
	public void setCharges(charges charges) {
		this.charges = charges;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	@Override
	public String toString() {
		return "productinfo [productId=" + productId + ", name=" + name + ", productType=" + productType + ", category="
				+ category + ", basePrice=" + basePrice + ", discount=" + discount + ", charges=" + charges
				+ ", finalPrice=" + finalPrice + "]";
	}
	



}