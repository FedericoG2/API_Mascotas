package com.proyecto.API.controller;

import com.proyecto.API.model.Persona;
import com.proyecto.API.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoService;

    @GetMapping("/personas/traer")
    public ResponseEntity<List<Persona>> getPersonas(){
        List<Persona> personas = persoService.getPersona();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }



    @PostMapping("/persona/crear")
    public ResponseEntity<String> savePersona(@RequestBody Persona persona) {
        persoService.savePersona(persona);
        return new ResponseEntity<>("Persona creada correctamente", HttpStatus.CREATED);
    }

    @DeleteMapping("/persona/eliminar/{id}")
    public ResponseEntity<String> deletePersona(@PathVariable Long id) {
        persoService.deletePersona(id);
        return new ResponseEntity<>("Persona eliminada con éxito", HttpStatus.OK);
    }

    @PutMapping("/persona/editar")
    public ResponseEntity<Persona> editPersona(@RequestBody Persona persona) {
        persoService.edit(persona);
        Persona personaEditada = persoService.findPersona(persona.getId());
        return new ResponseEntity<>(personaEditada, HttpStatus.OK);
    }

}
