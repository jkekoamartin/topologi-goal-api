package com.example.debuggerstpo.topologigoalapi.controllers;


import com.example.debuggerstpo.topologigoalapi.models.Stone;
import com.example.debuggerstpo.topologigoalapi.services.StoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoneController {

    private StoneService stoneService;

    public StoneController(StoneService stoneService) {
        this.stoneService = stoneService;
    }

    @GetMapping(value = "stones/{stoneName}")
    public Stone getStoneByName(@PathVariable(name = "stoneName") String stoneName){

        return stoneService.getStoneByName(stoneName);

    }
}
