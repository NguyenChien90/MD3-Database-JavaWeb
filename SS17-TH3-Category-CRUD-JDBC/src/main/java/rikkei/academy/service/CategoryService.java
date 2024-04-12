package rikkei.academy.service;

import rikkei.academy.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Integer id);
    void save(Category category);
    void delete(Integer id);
}
