package com.example.proyectodesarrollosrest.models;

import com.example.proyectodesarrollosrest.models.enums.Categorias;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "materiales")
public class Materiales {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id; 
   
   @Column(name = "nombre")
    private String nombre;

   @Column(name = "imagen")
    private String imagen;

    @Column(name = "categoria")
    private Categorias categoria;

    @Column(name = "activo")
    private boolean activo;
}
