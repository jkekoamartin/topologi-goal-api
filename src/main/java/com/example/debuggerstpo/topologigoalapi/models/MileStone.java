package com.example.debuggerstpo.topologigoalapi.models;

import javax.persistence.Entity;

@Entity(name = "Mile_Stone")
public class MileStone extends Stone {

    public MileStone() {
    }

    public MileStone(String name, String desc) {
        super(name, desc);
        this.type = this.getClass().getTypeName();

    }
}
