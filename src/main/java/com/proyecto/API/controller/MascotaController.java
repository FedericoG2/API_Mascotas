package com.proyecto.API.controller;

import com.proyecto.API.model.Mascota;
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
     public String saveMascota(@RequestBody Mascota mascota){
         mascoService.saveMascota(mascota);
         return "Mascota creada con exito";
     }

     @DeleteMapping("mascota/eliminar/{id}")
    public  String deleteMascota(@PathVariable Long id){
         mascoService.deleteMascota(id);
         return "Mascota eliminada con exito";

     }

    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota mascota) {
         mascoService.editMascota(mascota);
         return mascoService.findMascota(mascota.getId_mascota());
    }

}
