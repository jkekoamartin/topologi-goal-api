package com.example.debuggerstpo.topologigoalapi.models;

public class MileStone extends Stone {
    public MileStone(String name, String desc) {
        super(name, desc);
        this.type = this.getClass().getTypeName();

    }
}
