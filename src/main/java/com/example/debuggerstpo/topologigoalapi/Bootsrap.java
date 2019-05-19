package com.example.debuggerstpo.topologigoalapi;

import com.example.debuggerstpo.topologigoalapi.repositories.StoneRepository;
import com.example.debuggerstpo.topologigoalapi.models.SteppingStone;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.stereotype.Component;

@Component
public class Bootsrap {


    private StoneRepository stoneRepository;

    public Bootsrap(StoneRepository stoneRepository) {
        this.stoneRepository = stoneRepository;

        init();
    }

    private void init() {

        Stone stone = new SteppingStone("First", "First Stone");

        stoneRepository.save(stone);
    }
}
