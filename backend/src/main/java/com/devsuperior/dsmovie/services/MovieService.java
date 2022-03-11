package com.devsuperior.dsmovie.services;


import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)// method somente de leitura
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(p -> new MovieDTO(p));
        return page;
    }

    // criar exception para id invalido
    @Transactional(readOnly = true)// method somente de leitura
    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}

