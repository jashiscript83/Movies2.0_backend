package com.dario.VideoClub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dario.VideoClub.domain.Movies;
import com.dario.VideoClub.mapper.MoviesMapper;

@RestController
@RequestMapping("/movies")
public class VideoClubController {
	

	private MoviesMapper mapper;
	
	public VideoClubController(MoviesMapper mapper) {
		
		this.mapper = mapper;
		
	}
	
	
	@GetMapping("/all")
	public List<Movies> getAll(){
				
		List<Movies> movies = mapper.findAll();
			
	    
		return mapper.findAll();		
		
	}
	
	

}
