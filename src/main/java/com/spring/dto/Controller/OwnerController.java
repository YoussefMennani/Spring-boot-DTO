package com.spring.dto.Controller;

import com.spring.dto.Model.Owner;
import com.spring.dto.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/owners")
    public List<Owner> getAllOwners(){
        return ownerService.getAllOwners();
    }

    @PostMapping("/owner")
    public Owner saveOwner(@RequestBody Owner owner){
        return ownerService.addOwner(owner);
    }
}
