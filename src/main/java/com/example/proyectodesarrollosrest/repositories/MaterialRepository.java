package com.example.proyectodesarrollosrest.repositories;

import com.example.proyectodesarrollosrest.models.Materiales;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Materiales, Long> {
    // Aquí puedes agregar métodos personalizados para tus consultas
    List<Materiales> findByActivoTrue();
}