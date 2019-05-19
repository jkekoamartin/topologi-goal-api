package com.example.debuggerstpo.topologigoalapi.models;


import javax.persistence.Entity;

@Entity(name = "End_Stone")
public class EndStone extends Stone {


    public EndStone() {
    }

    public EndStone(String name, String desc) {
        super(name, desc);
        this.type = this.getClass().getTypeName();

    }
}
