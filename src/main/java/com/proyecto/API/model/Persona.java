package com.proyecto.API.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastname;
    private int age;

/**
 * Reelacion una persona tiene muchas mascotas y muchas mascotas pueden tener el mismo dueño.
 */
@OneToMany
    private List<Mascota> listaMascotas;

    public Persona() {
    }

    public Persona(Long id, String name, String lastname, int age, List<Mascota> listaMascotas) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.listaMascotas = listaMascotas;
    }
}
