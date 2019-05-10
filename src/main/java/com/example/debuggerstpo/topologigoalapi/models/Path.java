package com.example.debuggerstpo.topologigoalapi.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Path {

    List<Stone> stonePath;

    public Path(List<Stone> stonePath) {
        this.stonePath = stonePath;
    }
}
