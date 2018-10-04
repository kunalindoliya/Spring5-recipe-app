package kunal.springframework.recipe.repositories;

import kunal.springframework.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
