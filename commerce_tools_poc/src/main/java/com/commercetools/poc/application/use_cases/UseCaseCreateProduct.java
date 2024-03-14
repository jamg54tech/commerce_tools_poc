package com.commercetools.poc.application.use_cases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.poc.infraestructure.external.CommerceToolsClient;

@Service
public class UseCaseCreateProduct {
	
	@Autowired
	private CommerceToolsClient commerceToolsClient;
	
	
	public Product createProduct(ProductDraft input) {
		
		
		Product newProduct = commerceToolsClient.getApiClient()
				  .products()
				  .post(input)
				  .executeBlocking()
				  .getBody();
		
		return newProduct;
	}

}
