package com.commercetools.poc.application.dto;
import java.util.ArrayList;

import com.commercetools.api.models.product.Product;


public class ListProductsResponse {
	
	private int limit;
	private int offset;
	private int count;
	private int total;
	private ArrayList<Product> results;
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public ArrayList<Product> getResults() {
		return results;
	}
	public void setResults(ArrayList<Product> results) {
		this.results = results;
	}
	
	

}
