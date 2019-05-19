package com.example.debuggerstpo.topologigoalapi.models;

import javax.persistence.Entity;

@Entity(name = "Stepping_Stone")
public class SteppingStone extends Stone {

    public SteppingStone() {
        super();

    }

    public SteppingStone(String name, String desc) {
        super(name, desc);
        this.type = this.getClass().getName();
    }

}

