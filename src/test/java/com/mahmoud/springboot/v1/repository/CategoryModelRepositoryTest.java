package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.CategoryModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CategoryModelRepositoryTest {
    @Autowired
    private CategoryModelRepository categoryModelRepository;

    @Test
    public void getCategory(){
        Optional<CategoryModel> categoryModel =  categoryModelRepository.findById(Long.valueOf(1L));
        System.out.println(categoryModelRepository.findById(Long.valueOf(1L)));
        System.out.println(categoryModel.get().getCategoryName());
    }
}