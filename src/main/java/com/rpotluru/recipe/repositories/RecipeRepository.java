package com.rpotluru.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
