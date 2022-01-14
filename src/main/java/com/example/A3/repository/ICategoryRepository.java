package com.example.A3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.A3.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {

}
