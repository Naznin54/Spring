package com.example.Ecommerce.controller;

import com.example.Ecommerce.entity.Car;
import com.example.Ecommerce.repository.CarRepository;
import com.example.Ecommerce.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.createCar(car);
}
    @GetMapping
     public List<Car> getAllCarDetails() {
         List<Car> cars = carService.getAllCars();

         List<Car> responseList = new ArrayList<>();
         for (Car car : cars) {
             Car response = new Car();
             response.setCarId(car.getCarId());
             response.setCarName(car.getCarName());
             response.setManufacturingYear(car.getManufacturingYear());
             response.setColours(car.getColours());
             response.setModel(car.getModel());
             response.setAccessories(car.getAccessories());
             response.setPrice(car.getPrice());
             response.setPayments(car.getPayments());
             response.setDeliveryCities(car.getDeliveryCities());

             responseList.add(response);
         }
         return responseList;
}
}

