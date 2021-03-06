package com.ton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ton.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
