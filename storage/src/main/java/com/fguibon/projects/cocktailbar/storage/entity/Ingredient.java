package com.fguibon.projects.cocktailbar.storage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quantity;

    public Ingredient(){
        super();
    }

    public Ingredient(String name, int quantity){
        super();
        this.name = name;
        this.quantity = quantity;
    }
}
