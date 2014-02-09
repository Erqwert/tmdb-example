package com.jeff.mdb.services;

import java.util.ArrayList;
import java.util.List;

import com.jeff.mdb.client.TMDBService;
import com.jeff.mdb.client.impl.MovieDatabaseService;
import com.jeff.mdb.domain.Movie;

public class SafeSearchService_v1 {

	public List<Movie> getMoviesByName(String query) {

		MovieDatabaseService movieDatabaseService = new TMDBService();

		List<Movie> movies = movieDatabaseService.searchMovieByTitle(query);
		List<Movie> safeMovies = new ArrayList<Movie>();
		for (Movie m : movies) {
			if (!m.isAdult()) {
				safeMovies.add(m);
			}
		}

		return safeMovies;
	}
}