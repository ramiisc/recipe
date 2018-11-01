package com.rpotluru.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByDescription(String description);
}
