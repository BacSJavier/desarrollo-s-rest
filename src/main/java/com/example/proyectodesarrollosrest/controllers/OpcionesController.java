package com.example.proyectodesarrollosrest.controllers;

import com.example.proyectodesarrollosrest.models.Opciones;
import com.example.proyectodesarrollosrest.services.OpcionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/opciones")
public class OpcionesController {

    @Autowired
    private OpcionesService opcionesService;

    @GetMapping
    public List<Opciones> getAllOpciones() {
        return opcionesService.getAllOpciones();
    }

    // Aquí puedes agregar más métodos para manejar otras solicitudes HTTP, como POST, PUT y DELETE
}