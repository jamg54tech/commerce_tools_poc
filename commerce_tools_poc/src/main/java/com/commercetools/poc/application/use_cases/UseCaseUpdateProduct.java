package com.commercetools.poc.application.use_cases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.api.models.product.ProductUpdate;
import com.commercetools.poc.infraestructure.external.CommerceToolsClient;

@Service
public class UseCaseUpdateProduct {

	@Autowired
	private CommerceToolsClient commerceToolsClient;
	
	
	public Product UpdateProduct(String id,ProductUpdate newProperties) {
		
		
		Product productModified = commerceToolsClient.getApiClient()
				  .products()
				  .withId(id)
				  .post(newProperties)
				  .executeBlocking()
				  .getBody();
		
		return productModified;
	}

}
