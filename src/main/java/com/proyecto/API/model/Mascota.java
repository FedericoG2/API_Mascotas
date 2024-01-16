package com.proyecto.API.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String name;

    private String species;

    private String race;

    private String color;


    public Mascota() {
    }

    public Mascota(Long id_mascota, String name, String species, String race, String color, Mascota unaMascota) {
        this.id_mascota = id_mascota;
        this.name = name;
        this.species = species;
        this.race = race;
        this.color = color;

    }
}
