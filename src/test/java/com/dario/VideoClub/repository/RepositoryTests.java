package com.dario.VideoClub.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dario.VideoClub.domain.Movies;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {

	@Autowired
	VideoClubRepository repository;

	@Test
	public void testGetAllMovies() {
		
		List<Movies> result = repository.getAllMovies();
		
		result.forEach(e->{
			
			
			System.err.println(e);
		});
		

}
}
