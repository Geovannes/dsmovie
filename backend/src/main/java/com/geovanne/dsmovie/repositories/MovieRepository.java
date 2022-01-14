package com.geovanne.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanne.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
