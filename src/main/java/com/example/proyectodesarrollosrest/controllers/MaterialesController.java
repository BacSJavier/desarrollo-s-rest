package com.example.proyectodesarrollosrest.controllers;

import com.example.proyectodesarrollosrest.models.Materiales;
import com.example.proyectodesarrollosrest.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class MaterialesController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Materiales> getAllOpciones() {
        return materialService.getAllActiveMaterials();
    }

    // Aquí puedes agregar más métodos para manejar otras solicitudes HTTP, como POST, PUT y DELETE
}