package com.example.SpringFinanzasPersonales.models;

import jakarta.persistence.*;

@Entity
@Table( name = "roles" )
public class Rol {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;

    public Rol() {
    }

    public Rol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}