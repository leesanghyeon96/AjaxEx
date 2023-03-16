package com.ajax.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.ajax.dto.MovieDTO;
import com.ajax.entity.Movie;
import com.ajax.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	
	private final MovieRepository movieRepository; 
	
	public String movieInsert(MovieDTO movieDTO ) {
		
		Movie movie = movieDTO.createMovie(); 
		// createMovie() : moviewDTO의 값을 Movie 엔티티에 매핑해 넣고 
		// movie로 리턴
		
		// 저장
		movieRepository.save(movie); 
		
		return "DB Insert 성공"; 
		//DB의 값을 가져와 DTO로 리턴을 돌려줘도 된다.
	}
	

}
