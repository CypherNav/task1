package com.product.task1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.task1.entity.ProductEntity;
import com.product.task1.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	  @GetMapping("/productRange")
	    public List<ProductEntity> getProductsInRange(@RequestParam("maxprice") Double maxprice, @RequestParam("minprice") Double minprice) {
	        return productService.getProductsInRange(maxprice,minprice);
	    }
	  @GetMapping("/product/{value}")
	  public List<ProductEntity> getProductGreater(@PathVariable double value){
		  return productService.getProductGreater(value);
	  }
}
