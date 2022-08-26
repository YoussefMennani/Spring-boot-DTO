package com.spring.dto.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OwnerCarDto {

    private int id;

    private String firstName;

    private String lastName;

    private String cine;

    private String model;

    private String marque;

    private String matricule;


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
