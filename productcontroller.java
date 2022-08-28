package com.product.ppp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
	
	@Autowired
	productservice ss;
	
	
	@GetMapping("savedata")
	public productservice getdata() {
		
		
		return ss.saveproduct();
	}
	
	@GetMapping("deletedata/{id}")
public productservice deldata(@PathVariable int id) {
		
		
		return ss.deleteproduct(id);
	}
	
	@GetMapping("updatedata/{id}")
	public productservice updata(@PathVariable int id) {
			
			
			return ss.updateproduct(id);
		}
	
	@GetMapping("showallproducts")
	public ArrayList<product> showalldata() {
			
			
			return ss.showallproduct();
		}
	
	
	@GetMapping("getproducts/{id}")
	public productinfo  showalldat(@PathVariable int id) {
			
			return ss.getproduct(id);
			
		}
	
	
	
	
	
	
	
	
	
}
