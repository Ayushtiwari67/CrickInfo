package com.example.repository;

import com.example.entity.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CricketMatchRepository extends JpaRepository<CricketMatch ,Long> {

    Optional<CricketMatch> findByTeamHeading(String teamHeading);
}
