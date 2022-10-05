package com.javastriker.emekapetclinic.services;


import com.javastriker.emekapetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
