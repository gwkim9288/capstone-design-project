package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal,Integer>{

}
