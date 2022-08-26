package com.spring.dto.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String model;

    private String marque;

    private String matricule;

    @ManyToOne
    private Owner owner;

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getMarque() {
        return marque;
    }

    public String getMatricule() {
        return matricule;
    }

    public Owner getOwner() {
        return owner;
    }
}
