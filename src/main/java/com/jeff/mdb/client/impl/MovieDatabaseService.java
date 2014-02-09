package com.jeff.mdb.client.impl;

import java.util.List;

import com.jeff.mdb.domain.Movie;

public interface MovieDatabaseService {
	public void listMovieGenres();

	public List<Movie> searchMovieByTitle(String query);
}
