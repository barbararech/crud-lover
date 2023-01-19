package com.cars.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
  
}
