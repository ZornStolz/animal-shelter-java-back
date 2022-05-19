package com.shelter.animalback.service.interfaces;

import com.shelter.animalback.domain.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAll();

    Animal get(String name);

    Animal save(Animal animal);

    Animal replace(String name, Animal animal);

    Animal delete(String name);
}
