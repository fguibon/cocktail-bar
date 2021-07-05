package com.fguibon.projects.cocktailbar.storage.repository;

import com.fguibon.projects.cocktailbar.storage.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
