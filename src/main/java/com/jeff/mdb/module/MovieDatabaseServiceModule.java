package com.jeff.mdb.module;

import com.google.inject.AbstractModule;
import com.jeff.mdb.client.TMDBService;
import com.jeff.mdb.client.impl.MovieDatabaseService;

public class MovieDatabaseServiceModule extends AbstractModule {

	@Override
	protected void configure() {

		bind(MovieDatabaseService.class).to(TMDBService.class);

	}

}
