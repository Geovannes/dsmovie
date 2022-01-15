package com.geovanne.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanne.dsmovie.entities.Score;
import com.geovanne.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
