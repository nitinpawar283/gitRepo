package com.demo;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder {
	
	private static List<Movie> movielist;
	
	static {
		
		movielist=new ArrayList<>();
		
		movielist.add(new Movie(2016,"Sultan"));
		movielist.add(new Movie(2016,"Dangal"));
		movielist.add(new Movie(2016,"Rustom"));
		movielist.add(new Movie(2017,"Bahubali:2"));
		movielist.add(new Movie(2017,"Ghaji"));
		movielist.add(new Movie(2017,"Begamjaan"));
	}
	
	public List<Movie> foundMovieByName(int year){
	
		List<Movie> foundlist=new ArrayList<>();
	
	for(Movie movie:movielist){
		
		if(movie.getYear()==year){
			
			foundlist.add(movie);
			
		}
	}
	
	return foundlist;
	}
	

}
