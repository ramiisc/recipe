package com.rpotluru.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rpotluru.recipe.services.RecipeService;

@Controller
public class IndexController {

	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

//	
//	private CategoryRepository categoryRepository;
//	private UnitOfMeasureRepository unitOfMeasureRepository;
//	
//	
//	
//	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//		super();
//		this.categoryRepository = categoryRepository;
//		this.unitOfMeasureRepository = unitOfMeasureRepository;
//	}
//
//	@RequestMapping({"","/","index"})
//	public String getIndex() {
//		Optional<Category> category = categoryRepository.findById((long) 1);
//		System.out.println("category Description:"+category.get().getDescription());
//		
//		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findById((long) 1);
//		System.out.println("UnitOfMeasure Description:"+unitOfMeasure.get().getDescription());
//		
//		category = categoryRepository.findByDescription("American");
//		System.out.println("category Description:"+category.get().getId());
//		
//		unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");
//		System.out.println("UnitOfMeasure Description:"+unitOfMeasure.get().getId());
//		return "index";
//	}

	@RequestMapping({ "", "/", "index" })
	public String getIndex(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}

}
