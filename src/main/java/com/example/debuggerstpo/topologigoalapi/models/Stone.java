package com.example.debuggerstpo.topologigoalapi.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Stone {

    String name;

    String desc;

    Boolean isComplete;

    public Stone(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.isComplete = false;
    }
}
