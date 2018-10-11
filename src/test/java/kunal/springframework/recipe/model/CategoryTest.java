package kunal.springframework.recipe.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
    Category category;

    @Before
    public void setUp(){
        category=new Category();

    }

    @Test
    public void getId() {
        Long idval=4L;
        category.setId(idval);
        assertEquals(idval,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}