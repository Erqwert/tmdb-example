package com.jeff.mdb;

import com.jeff.mdb.client.TMDBService;
import com.jeff.mdb.client.impl.MovieDatabaseService;

public class MovieDatabaseServiceFactory {

	
	private static MovieDatabaseService client;
	
	public static MovieDatabaseService getMovieDatabaseClient(){
		if (client == null){
			client = new TMDBService();
		}
		return client;
	}
	
	
	
	/**
	 * Method specifically created to help us test code that depends on this factory.
	 * 
	 * @param testClient
	 */
	public static void setMovieDatabaseClientForTesting(MovieDatabaseService testClient){
		client = testClient;
	}
	
}
