package com.jeff.mdb.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestClientFactory {

	private Client client;

	private static RestClientFactory instance;

	private RestClientFactory() {
		client = Client.create();
		ClientConfig cfg = new DefaultClientConfig();
		cfg.getClasses().add(JacksonJsonProvider.class);
		this.client = Client.create(cfg);
	}

	public static RestClientFactory getInstance() {
		if (instance == null) {
			synchronized (RestClientFactory.class) {
				if (instance == null) {
					instance = new RestClientFactory();
				}
			}
		}
		return instance;
	}

	public Client getClient() {
		return this.client;
	}

}
