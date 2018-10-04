package kunal.springframework.recipe.controllers;

import kunal.springframework.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

   /* private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }*/
   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        /*Optional<Category> categoryOptional= categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uom=unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat id: "+categoryOptional.get().getId());
        System.out.println("Uom id : "+uom.get().getId());*/
        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }
}
