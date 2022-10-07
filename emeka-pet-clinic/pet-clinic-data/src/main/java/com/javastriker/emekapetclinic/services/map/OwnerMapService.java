package com.javastriker.emekapetclinic.services.map;

import com.javastriker.emekapetclinic.model.Owner;

import com.javastriker.emekapetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return super.map.values().stream().filter(owner -> owner.getLastName().equals(lastname)).findFirst().get();
    }

    @Override
    public long count(){
        return super.map.values().size();
    }
}
