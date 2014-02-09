package com.jeff.mdb.services;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.jeff.mdb.MovieDatabaseServiceFactory;
import com.jeff.mdb.client.impl.MovieDatabaseService;
import com.jeff.mdb.domain.Movie;

public class SafeSearchService_v3 {

	private final MovieDatabaseService movieDatabaseService;

	@Inject
	public SafeSearchService_v3(MovieDatabaseService movieDatabaseService) {
		this.movieDatabaseService = movieDatabaseService;
	}

	public List<Movie> getMoviesByName(String query) {
		MovieDatabaseService movieDatabaseService = MovieDatabaseServiceFactory
				.getMovieDatabaseClient();

		List<Movie> movies = this.movieDatabaseService
				.searchMovieByTitle(query);
		List<Movie> safeMovies = new ArrayList<Movie>();
		for (Movie m : movies) {
			if (!m.isAdult()) {
				safeMovies.add(m);
			}
		}

		return safeMovies;
	}
}