package com.example.debuggerstpo.topologigoalapi.services;

import com.example.debuggerstpo.topologigoalapi.ds.TGGraph;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TGGraphService extends CrudRepository<TGGraph<Stone>, Long> {

}
