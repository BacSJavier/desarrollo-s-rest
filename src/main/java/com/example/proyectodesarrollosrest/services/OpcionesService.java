package com.example.proyectodesarrollosrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectodesarrollosrest.models.Opciones;
import com.example.proyectodesarrollosrest.repositories.OpcionesRepository;

@Service
public class OpcionesService {
    @Autowired
    private OpcionesRepository opcionesRepository;

    public List<Opciones> getAllOpciones() {
    // Aquí puedes implementar la lógica para obtener todos los materiales activos
    // Por ejemplo, podrías llamar a un método en materialRepository que devuelve todos los materiales activos
    return opcionesRepository.findByActivoTrue();
    }
}
