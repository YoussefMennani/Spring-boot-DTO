package com.spring.dto.Service;

import com.spring.dto.Model.Car;
import com.spring.dto.Model.Owner;
import com.spring.dto.Repository.CarRepository;
import com.spring.dto.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car addCar(Car car){
        return carRepository.save(car);
    }

}
