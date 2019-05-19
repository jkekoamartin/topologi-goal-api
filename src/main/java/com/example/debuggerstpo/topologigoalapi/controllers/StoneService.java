package com.example.debuggerstpo.topologigoalapi.controllers;

import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.stereotype.Service;

@Service
public class StoneService {



    private StoneRepository stoneRepository;

    public StoneService(StoneRepository stoneRepository) {
        this.stoneRepository = stoneRepository;
    }


    public Stone getStoneByName(String stoneName) {

        return stoneRepository.findStoneByName(stoneName);
    }
}
