package kunal.springframework.recipe.services;

import kunal.springframework.recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
