package com.commercetools.poc.application.use_cases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commercetools.poc.application.dto.ListProductsResponse;
import com.commercetools.poc.infraestructure.external.CommerceToolsClient;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductPagedQueryResponse;


@Service
public class UseCaseListProducts {
	
	@Autowired
	private CommerceToolsClient commerceToolsClient;
	
	public ProductPagedQueryResponse listProducts() {
		
		ProjectApiRoot apiRoot = commerceToolsClient.getApiClient();
		
		return apiRoot.products().get().executeBlocking().getBody();
	}
	
	
	public Product getProductById(String id) {
		
		ProjectApiRoot apiRoot = commerceToolsClient.getApiClient();
		
		return apiRoot.products().withId(id).get().executeBlocking()
				  .getBody();
	}
	

}
