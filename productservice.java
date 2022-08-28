package com.product.ppp;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class productservice {
	public productservice() {

	}

	public productservice(String a) {

	}

	@Autowired
	SessionFactory sf;

	// to save all products

	public productservice saveproduct() {
		Session ss = sf.openSession();
		Transaction tra = ss.beginTransaction();
		ss.save(new product(1001, "Lenovo Yoga", "Laptop", "Electronics", 45000));
		ss.save(new product(1002, "LG Washing Machine", " Washing Machine", "Home Appliances", 25000));
		ss.save(new product(1003, "HP Pavilion 360", "Laptop", "Electronics", 60000));
		ss.save(new product(1004, "US Polo Assn ", "T-Shirt", "Clothing", 1200));
		ss.save(new product(1005, "Neelkamal Been Bag", "Sofa Set", "Furniture", 350));
		tra.commit();

		return new productservice("save data sucessfully");

	}
//to delete product based on id
	public productservice deleteproduct(int id) {
		Session ss = sf.openSession();
		Transaction tra = ss.beginTransaction();
		product x = ss.load(product.class, id);
		ss.delete(x);
		tra.commit();

		return new productservice("Delete data sucessfully");

	}
	//to Update product based on id
	public productservice updateproduct(int id) {
		Session ss = sf.openSession();
		Transaction tra = ss.beginTransaction();
		product x = new product(id, "LG", "TV", "Electronics", 30000);
		ss.update(x);
		tra.commit();

		return new productservice("Update data sucessfully");

	}
	
	//to show all product based (Arraylist product)
	public ArrayList<product> showallproduct() {
		Session ss = sf.openSession();
		Criteria ctr = ss.createCriteria(product.class);
		ArrayList<product> al = (ArrayList<product>) ctr.list();

		return al;

	}

	
	//getproduct by id with gst and final price 
	
	public productinfo getproduct(int id) {
		Session ss = sf.openSession();
		product x = ss.load(product.class, id);
		charges_per_categery cg = ss.get(charges_per_categery.class, id);

		double discount = x.getProduct_Price() * cg.getDiscount();

		double total = 100 / (100 + cg.getGST());

		double GST_AMOUNT = x.getProduct_Price() * total;

		double GST = x.getProduct_Price() - GST_AMOUNT;

		double finalprice = x.getProduct_Price() - discount + GST + cg.getDelivey_Charge();

		productinfo pr = new productinfo(x.getProduct_ID(), x.getProduct_Name(), x.getProduct_Type(),
				x.getProduct_Category(), x.getProduct_Price(), discount, new charges(GST, cg.getDelivey_Charge()),
				finalprice);
               
		System.err.println(pr);
		
		return pr;

	}

}
