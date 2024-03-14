package com.commercetools.poc.infraestructure.adapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.api.models.product.ProductPagedQueryResponse;
import com.commercetools.api.models.product.ProductUpdate;
import com.commercetools.poc.application.use_cases.UseCaseCreateProduct;
import com.commercetools.poc.application.use_cases.UseCaseListProducts;
import com.commercetools.poc.application.use_cases.UseCaseUpdateProduct;

@RestController
public class ProductsController {
	

	@Autowired
	UseCaseListProducts productService;
	
	@Autowired
	UseCaseCreateProduct productService2;
	
	@Autowired
	UseCaseUpdateProduct productService3;
	
	
	@RequestMapping(value = "api/ct/product",method = RequestMethod.GET)
    public  ProductPagedQueryResponse listProducts(){
       
		return this.productService.listProducts();
    }
	
	@RequestMapping(value = "api/ct/product/{id}",method = RequestMethod.GET)
    public  Product listProducts(@PathVariable String id){
       
		return this.productService.getProductById(id);
    }
	
	@RequestMapping(value = "api/ct/product",method = RequestMethod.POST)
    public  Product createProduct(@RequestBody ProductDraft product){
       
		return this.productService2.createProduct(product);
    }
	

	@RequestMapping(value = "api/ct/product/{id}",method = RequestMethod.PUT)
    public  Product updateProduct(@PathVariable String id, @RequestBody ProductUpdate newProperties){
       
		return this.productService3.UpdateProduct(id,newProperties);
    }
}
