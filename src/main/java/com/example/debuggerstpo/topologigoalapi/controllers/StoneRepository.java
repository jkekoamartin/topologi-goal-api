package com.example.debuggerstpo.topologigoalapi.controllers;


import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoneRepository extends JpaRepository<Stone, Long> {

    Stone findStoneByName(String stoneName);
}
