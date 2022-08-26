package com.spring.dto.Service;

import com.spring.dto.Model.Owner;
import com.spring.dto.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    public Owner addOwner(Owner owner){
        return ownerRepository.save(owner);
    }
}
