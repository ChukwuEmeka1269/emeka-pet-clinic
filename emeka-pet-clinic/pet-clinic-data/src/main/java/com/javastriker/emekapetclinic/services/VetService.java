package com.javastriker.emekapetclinic.services;

import com.javastriker.emekapetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
