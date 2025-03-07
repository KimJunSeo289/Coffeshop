package com.jun.cafe.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jun.cafe.dto.Product;
import com.jun.cafe.service.ProductService;

@RestController
@CrossOrigin("http://127.0.0.1:5500/")
public class ProductController {
	
	@Autowired
	ProductService productSerivce;

	Map<String, Object> storage = new HashMap();
	
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducts() {
		try {
			Object o = storage.get("firstPageProduct");
			if(o==null) {
				List<Product> list =productSerivce.getAllProducts();
				storage.put("firstPageProduct", list);
				return list;
			}
			return(List<Product>)o;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
