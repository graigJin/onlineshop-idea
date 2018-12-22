package com.graigjin.onlineshopidea.controller;

import com.graigjin.onlineshopideabackend.dao.CategoryDAO;
import com.graigjin.onlineshopideabackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/", "/home", "index"})
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");

        // passing the list of categories
        mv.addObject("categories", categoryDAO.list());

        mv.addObject("userClickedHome", true);
        return mv;
    }

    @RequestMapping(value = "/about")
    public ModelAndView about() {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickedAbout", true);
        return mv;
    }

    @RequestMapping(value = "/contact")
    public ModelAndView contact() {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Contact Us");
        mv.addObject("userClickedContact", true);
        return mv;
    }

    /* Methods to load products based on category */

    @RequestMapping(value = "/show/all/products")
    public ModelAndView showAllProducts() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "All Products");

        mv.addObject("categories", categoryDAO.list());

        mv.addObject("userClickedAllProducts", true);
        return mv;
    }

    @RequestMapping(value = "/show/category/{id}/products")
    public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("page");

        Category category = categoryDAO.get(id);

        mv.addObject("title", category.getName());

        mv.addObject("categories", categoryDAO.list());

        mv.addObject("category", category);

        mv.addObject("userClickedCategoryProducts", true);
        return mv;
    }

}
