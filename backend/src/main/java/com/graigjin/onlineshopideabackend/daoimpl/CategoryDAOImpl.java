package com.graigjin.onlineshopideabackend.daoimpl;

import com.graigjin.onlineshopideabackend.dao.CategoryDAO;
import com.graigjin.onlineshopideabackend.dto.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();
        category.setId(1);
        category.setName("Television");
        category.setDescription("This is the Television description.");
        category.setImageURL("CAT_1.png");

        categories.add(category);

        category = new Category();
        category.setId(2);
        category.setName("Mobile");
        category.setDescription("This is the Mobile description.");
        category.setImageURL("CAT_2.png");

        categories.add(category);

        category = new Category();
        category.setId(3);
        category.setName("Laptop");
        category.setDescription("This is the Laptop description.");
        category.setImageURL("CAT_3.png");

        categories.add(category);
    }

    @Override
    public List<Category> list() {
        return categories;
    }

    @Override
    public Category get(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
