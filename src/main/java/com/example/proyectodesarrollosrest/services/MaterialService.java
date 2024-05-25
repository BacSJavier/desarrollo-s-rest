package com.example.proyectodesarrollosrest.services;

import com.example.proyectodesarrollosrest.models.Materiales;
import com.example.proyectodesarrollosrest.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Materiales> getAllActiveMaterials() {
        // Aquí puedes implementar la lógica para obtener todos los materiales activos
        // Por ejemplo, podrías llamar a un método en materialRepository que devuelve todos los materiales activos
        return materialRepository.findByActivoTrue();
    }

    // Aquí puedes agregar más métodos para manejar otras operaciones, como crear, actualizar y eliminar materiales
}