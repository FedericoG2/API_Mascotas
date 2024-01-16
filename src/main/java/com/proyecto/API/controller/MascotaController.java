package com.proyecto.API.controller;

import com.proyecto.API.model.Mascota;
import com.proyecto.API.model.Persona;
import com.proyecto.API.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService mascoService;
     @GetMapping("mascotas/traer")
    public List<Mascota> getMascotas(){
         return mascoService.getMascotas();

     }
     @PostMapping("mascota/crear")
     public String saveMascota(@RequestBody Mascota masc){
         mascoService.saveMascota(masc);
         return "Mascota creada con exito";
     }

     @DeleteMapping("mascotas/eliminar/{id}")
    public  String deleteMascotas(@PathVariable Long id){
         mascoService.deleteMascota(id);
         return "Mascota eliminada con exito";

     }

     @PutMapping("/mascotas/editar/{id}")
    public Mascota editMascota(@PathVariable Long id,@RequestParam(required = false,name = "nombre") String newName, @RequestParam(required = false,name = "especie") String newSpecies, @RequestParam(required = false,name = "raza") String newRace,@RequestParam(required = false,name = "color") String newColor){
       mascoService.editMascota(id, newName, newSpecies, newRace, newColor);
       Mascota m = mascoService.findMascota(id);

       return  m;
     }

}
