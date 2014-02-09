package com.jeff.mdb.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class TMDBResult {

	@XmlElement(name = "page")
	private int page;

	@XmlElement(name = "results")
	private List<Movie> results;

	@XmlElement(name = "total_pages")
	private int totalPages;

	@XmlElement(name = "total_results")
	private int totalResults;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Movie> getResults() {
		return results;
	}

	public void setResults(List<Movie> results) {
		this.results = results;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

}
