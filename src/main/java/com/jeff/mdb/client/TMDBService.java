package com.jeff.mdb.client;

import java.util.List;

import com.jeff.mdb.client.impl.MovieDatabaseService;
import com.jeff.mdb.domain.Movie;
import com.jeff.mdb.domain.TMDBResult;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TMDBService implements MovieDatabaseService {

	private static final String SERVER = "http://api.themoviedb.org";
	private static final String API_KEY = "7fd12c13192a672124fabb451bc8e3db";

	public void listMovieGenres() {

		String path = "/3/genre/list";
		WebResource resource = getClient().resource(SERVER + path).queryParam(
				"api_key", API_KEY);

		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);
		String responseText = processReponse(response);

		System.out.println(responseText);
	}

	public List<Movie> searchMovieByTitle(String title) {

		String path = "/3/search/movie";
		WebResource resource = getClient().resource(SERVER + path)
				.queryParam("api_key", API_KEY).queryParam("query", title);

		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);

		TMDBResult result = response.getEntity(TMDBResult.class);
		return result.getResults();
	}

	/**
	 * Process the response and throws it out if its not a 200
	 * 
	 * @param response
	 * @return
	 */
	private String processReponse(ClientResponse response) {
		if (response.getStatus() != 200) {
			System.out.println(response.getEntity(String.class));
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		return response.getEntity(String.class);
	}

	private Client getClient() {
		return RestClientFactory.getInstance().getClient();
	}

}
