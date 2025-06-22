package com.xworkz.movie.runner;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImpl;

public class MovieRunner {
    public static void main(String[] args) {
        MovieDto movieDto=new MovieDto(1,"Gaalipata");
        MovieService movieService=new MovieServiceImpl();
        movieService.saveAndValidate(movieDto);
    }
}
