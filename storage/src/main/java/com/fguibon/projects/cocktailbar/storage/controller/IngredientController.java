package com.fguibon.projects.cocktailbar.storage.controller;

import java.util.List;

import com.fguibon.projects.cocktailbar.storage.entity.Ingredient;
import com.fguibon.projects.cocktailbar.storage.service.IngredientService;
import com.google.common.base.Preconditions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(IngredientController.class);

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public List<Ingredient> findAll(){
        return this.ingredientService.findAll();
    }

    @PostMapping
    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
        Preconditions.checkNotNull(ingredient);
        return this.ingredientService.addIngredient(ingredient);
    }

    @GetMapping(value = "/{id}")
    public Ingredient getIngredient(@PathVariable Long id){
        return this.ingredientService.getIngredient(id).get();
    }

    @PatchMapping
    public Ingredient updateIngredient(Ingredient ingredient){
        return this.ingredientService.updateIngredient(ingredient);
    }

    @DeleteMapping
    public void deleteIngredient(Ingredient ingredient){
        this.ingredientService.deleteIngredient(ingredient);
    }
}
