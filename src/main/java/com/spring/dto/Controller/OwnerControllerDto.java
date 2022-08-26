package com.spring.dto.Controller;

import com.spring.dto.Service.OwnerServiceDto;
import com.spring.dto.dto.OwnerCarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dto")
public class OwnerControllerDto {

    @Autowired
    OwnerServiceDto userServiceDto;

    @GetMapping("/owner+")
    public List<OwnerCarDto> getAllOwnerCar(){
        return  userServiceDto.getAllOwnerCar();
    }
}
