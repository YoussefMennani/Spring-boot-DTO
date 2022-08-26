package com.spring.dto.Service;


import com.spring.dto.Model.Owner;
import com.spring.dto.Repository.OwnerRepository;
import com.spring.dto.dto.OwnerCarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceDto {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<OwnerCarDto> getAllOwnerCar(){

        return ownerRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }

    public OwnerCarDto convertEntityToDto(Owner owner){
        OwnerCarDto ownerCarDto = new OwnerCarDto();

        ownerCarDto.setId(owner.getId());
        ownerCarDto.setCine(owner.getCine());
        ownerCarDto.setFirstName(owner.getFirstName());
        ownerCarDto.setLastName(owner.getLastName());
        ownerCarDto.setMarque(owner.getCars().get(0).getMarque());
        ownerCarDto.setMatricule(owner.getCars().get(0).getMatricule());
        ownerCarDto.setModel(owner.getCars().get(0).getModel());

        return ownerCarDto;
    }
}
