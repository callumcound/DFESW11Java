package com.qa;



import java.sql.SQLException;

import com.qa.dao.MovieDAO;
import com.qa.domain.Movie;

public class Runner {
	public static void main(String[] args) throws SQLException {
		
		Movie movieOne = new Movie("Mean Girls", "Comedy", 10);
		Movie movieTwo = new Movie("Stalker", "Drama", 6);
		Movie movieThree = new Movie("Kath and Kimderella", "Comedy", 10);
		Movie movieFour = new Movie("Solaris", "Sci-Fi", 2);
		Movie movieFive = new Movie("Shrek", "Family", 10);
		Movie changedMovie = new Movie("Harry Potter", "Tragedy", 3);
		MovieDAO dao = new MovieDAO();
		
//		dao.create(movieOne);
//		dao.create(movieTwo);
//		dao.create(movieThree);
//		dao.createPrepared(movieFive);
//		dao.delete(2);
		
//		dao.deletePrepared(7);
//		dao.updatePrepared(movieFour, 2);
//		System.out.println(dao.readAll());
		System.out.println(dao.readByIdPrepared(3));
	}
}
