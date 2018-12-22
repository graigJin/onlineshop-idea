package com.graigjin.onlineshopideabackend.dao;

import com.graigjin.onlineshopideabackend.dto.Category;

import java.util.List;

public interface CategoryDAO {

    List<Category> list();

    Category get(int id);
}
