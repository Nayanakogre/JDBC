package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDto;

public interface MovieRepository {
    public void save(MovieDto movieDto);
}
