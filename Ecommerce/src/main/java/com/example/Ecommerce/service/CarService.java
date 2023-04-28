package com.example.Ecommerce.service;

import com.example.Ecommerce.entity.Car;
import com.example.Ecommerce.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;


    public Car createCar(Car car) {

            return carRepository.save(car);

    }

    public List<Car> getAllCars() {
        return null;
    }
}
