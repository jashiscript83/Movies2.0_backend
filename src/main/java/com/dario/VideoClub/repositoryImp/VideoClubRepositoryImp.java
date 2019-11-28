package com.dario.VideoClub.repositoryImp;


import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dario.VideoClub.domain.Movies;
import com.dario.VideoClub.repository.VideoClubRepository;



@Repository
public class VideoClubRepositoryImp implements VideoClubRepository{

	private static final Logger LOGGER = LoggerFactory.getLogger(VideoClubRepositoryImp.class);
	
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Override
	public List<Movies> getAllMovies() {
		SqlSession session = sessionFactory.openSession();
		List<Movies> result = Collections.emptyList();
		
		try {
			result = session.selectList("com.dario.VideoClub.mapper.MoviesMapper/getAllMovies");
		} catch (Exception e) {
			
			LOGGER.error(e.getMessage());
		}finally {
			
			
		}
		
		return result;
	}

}
