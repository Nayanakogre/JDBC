package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.MovieRepositoryImpl;

public class MovieServiceImpl implements MovieService{
    MovieRepository movieRepository=new MovieRepositoryImpl();
    @Override
    public void saveAndValidate(MovieDto movieDto) {

        if(movieDto!=null)
        {
            System.out.println("dto is not null");
            movieRepository.save(movieDto);
            //String lead=movieDto.getLeads();
            String movie=movieDto.getMovie();

            if( !movie.isEmpty()  )
            {
                System.out.println("Movie name and Lead are valid");
            }
            else {
                System.out.println("Movie name and Lead are not valid");
            }
        }
        else {
            System.out.println("Dto is null");
        }

    }
}
