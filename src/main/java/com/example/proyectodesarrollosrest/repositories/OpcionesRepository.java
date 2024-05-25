package com.example.proyectodesarrollosrest.repositories;

import com.example.proyectodesarrollosrest.models.Opciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionesRepository extends JpaRepository<Opciones, Long> {
    // Aquí puedes agregar métodos personalizados para tus consultas
    List<Opciones> findByActivoTrue();
}