package com.proyecto.API.controller;

import com.proyecto.API.model.Persona;
import com.proyecto.API.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return persoService.getPersona();
    }



    @PostMapping("persona/crear")
    public String savePersona(@RequestBody Persona persona){
        persoService.savePersona(persona);
        return "Persona creada correctamente";
    }

    @DeleteMapping("persona/eliminar/{id}")
    public String deletePersona(@PathVariable Long id) {
        persoService.deletePersona(id);
        return "Persona eliminada con exito";
    }

    @PutMapping("/persona/editar")
    public Persona editPersona(@RequestBody Persona persona) {

        persoService.edit(persona);

        return persoService.findPersona(persona.getId());
    }

}
