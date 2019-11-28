package com.dario.VideoClub.repository;

	import java.util.List;

import com.dario.VideoClub.domain.Movies;

	public interface VideoClubRepository {
		

		public List<Movies> getAllMovies();
	}
