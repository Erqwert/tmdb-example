package com.jeff.mdb.app;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jeff.mdb.domain.Movie;
import com.jeff.mdb.module.MovieDatabaseServiceModule;
import com.jeff.mdb.services.SafeSearchService_v1;
import com.jeff.mdb.services.SafeSearchService_v3;

public class MyMovieDB {

	public static void main(String[] args) {

		SafeSearchService_v1 service = new SafeSearchService_v1();
		List<Movie> safeMovies = service.getMoviesByName("wolf");

		Injector injector = Guice
				.createInjector(new MovieDatabaseServiceModule());
		// SafeSearchService_v3 service3 =
		SafeSearchService_v3 service3 = injector
				.getInstance(SafeSearchService_v3.class);

		printOutMovieNames(service3.getMoviesByName("wolf"));

	}

	private static void printOutMovieNames(List<Movie> movies) {
		for (Movie m : movies) {
			System.out.println(m.getTitle());
		}
	}
}
