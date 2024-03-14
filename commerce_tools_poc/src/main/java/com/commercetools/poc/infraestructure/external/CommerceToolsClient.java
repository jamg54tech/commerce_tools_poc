package com.commercetools.poc.infraestructure.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Required imports
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.*;

@Configuration
public class CommerceToolsClient {
	
	@Value("${commercetools.client_id}")
	private String clientId;
	
	@Value("${commercetools.secret}")
	private String clientSecret;

	@Value("${commercetools.project_key}")
	private String projectKey;
	
	
	@Bean
	public ProjectApiRoot getApiClient() {
		
		System.out.println("CLIENT ID:"+clientId);
		System.out.println("CLIENT SECRET:"+clientSecret);
		System.out.println("PROJECT KEY:"+projectKey);
		
		ProjectApiRoot apiRoot = ApiRootBuilder.of()
				.defaultClient(
						ClientCredentials.of()
						.withClientId(clientId)
						.withClientSecret(clientSecret)
						.build(),
						ServiceRegion.GCP_US_CENTRAL1)
				.build(projectKey);

		return apiRoot;
	}
}
