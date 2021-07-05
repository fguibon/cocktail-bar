package com.fguibon.projects.cocktailbar.storage.service;

import java.util.List;
import java.util.Optional;

import com.fguibon.projects.cocktailbar.storage.entity.Ingredient;
import com.fguibon.projects.cocktailbar.storage.repository.IngredientRepository;

import org.springframework.stereotype.Service;

@Service
public class IngredientService {
    
    private IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository){
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findAll(){
        return this.ingredientRepository.findAll();
    }

    public Ingredient addIngredient(Ingredient ingredient){
        return this.ingredientRepository.save(ingredient);
    }

    public Optional<Ingredient> getIngredient(Long id){
        return this.ingredientRepository.findById(id);
    }

    public Ingredient updateIngredient(Ingredient ingredient){
        return this.ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(Ingredient ingredient){
        this.ingredientRepository.delete(ingredient);
    }
}
