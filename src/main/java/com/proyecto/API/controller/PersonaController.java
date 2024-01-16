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



    @PostMapping("personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoService.savePersona(perso);
        return "Persona creada correctamente";
    }

    @DeleteMapping("personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id) {
        persoService.deletePersona(id);
        return "Persona eliminada con exito";
    }

    @PutMapping("/persona/editar")
    public Persona editPersona(@RequestBody Persona perso) {

        persoService.edit(perso);

        return persoService.findPersona(perso.getId());
    }

}
