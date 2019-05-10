package com.example.debuggerstpo.topologigoalapi.services;

import com.example.debuggerstpo.topologigoalapi.ds.TGGraph;
import com.example.debuggerstpo.topologigoalapi.models.Stone;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Primary
public class TGGraphServiceV1 implements TGGraphService {

    // implement these, hookup to persistence

    @Override
    public <S extends TGGraph<Stone>> S save(S s) {
        return null;
    }

    @Override
    public <S extends TGGraph<Stone>> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<TGGraph<Stone>> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<TGGraph<Stone>> findAll() {
        return null;
    }

    @Override
    public Iterable<TGGraph<Stone>> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(TGGraph<Stone> stoneTGGraph) {

    }

    @Override
    public void deleteAll(Iterable<? extends TGGraph<Stone>> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
