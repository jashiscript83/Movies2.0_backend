package com.dario.VideoClub.mapper;

	import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dario.VideoClub.domain.Movies;


	@Mapper
	public interface MoviesMapper {

		
		@Select("select * from dario.movies")
		List<Movies>findAll();
		

		
	}
