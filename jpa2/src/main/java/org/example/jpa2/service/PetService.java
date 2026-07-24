package org.example.jpa2.service;

import lombok.RequiredArgsConstructor;
import org.example.jpa2.entity.Pet;
import org.example.jpa2.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public List<Pet> findAll() {
        return petRepository.findAll();
    }
    public Pet findById(Long id) {
        return petRepository.findById(id).orElseThrow();
    }
    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }
    public Pet update(Pet pet) {
         return petRepository.save(pet);
    }
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
