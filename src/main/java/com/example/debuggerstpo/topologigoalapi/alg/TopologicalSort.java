package com.example.debuggerstpo.topologigoalapi.alg;

import com.example.debuggerstpo.topologigoalapi.models.Path;
import com.example.debuggerstpo.topologigoalapi.models.Stone;

public interface TopologicalSort {

    // this should be it. Just give it a stone, then show what it takes to get there.

    Path getPathToStone(Stone stone);

}
