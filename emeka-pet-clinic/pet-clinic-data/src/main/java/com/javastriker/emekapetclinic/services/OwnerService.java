package com.javastriker.emekapetclinic.services;

import com.javastriker.emekapetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastname);

    long count();
}
