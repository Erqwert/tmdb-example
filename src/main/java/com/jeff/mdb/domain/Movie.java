package com.jeff.mdb.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

	@XmlElement(name = "adult")
	boolean adult;

	@XmlElement(name = "backdrop_path")
	String backDropPath;

	@XmlElement(name = "id")
	int id;

	@XmlElement(name = "original_title")
	String originalTitle;

	@XmlElement(name = "release_date")
	Date releaseDate;

	@XmlElement(name = "poster_path")
	String posterPath;

	@XmlElement(name = "title")
	String title;

	@XmlElement(name = "vote_average")
	double voteAverage;

	@XmlElement(name = "vote_count")
	int voteCount;

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getBackDropPath() {
		return backDropPath;
	}

	public void setBackDropPath(String backDropPath) {
		this.backDropPath = backDropPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(double voteAverage) {
		this.voteAverage = voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

}
