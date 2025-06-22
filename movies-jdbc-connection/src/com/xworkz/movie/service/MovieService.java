package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;

public interface MovieService {
    public void saveAndValidate(MovieDto movieDto);
}
