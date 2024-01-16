package com.proyecto.API.controller;

import com.proyecto.API.model.Mascota;
import com.proyecto.API.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService mascoService;
    @GetMapping("/mascotas/traer")
    public ResponseEntity<List<Mascota>> getMascotas() {
        List<Mascota> mascotas = mascoService.getMascotas();
        return new ResponseEntity<>(mascotas, HttpStatus.OK);
    }
    @PostMapping("/mascota/crear")
    public ResponseEntity<String> saveMascota(@RequestBody Mascota mascota) {
        mascoService.saveMascota(mascota);
        return new ResponseEntity<>("Mascota creada con éxito", HttpStatus.CREATED);
    }

    @DeleteMapping("/mascota/eliminar/{id}")
    public ResponseEntity<String> deleteMascota(@PathVariable Long id) {
        mascoService.deleteMascota(id);
        return new ResponseEntity<>("Mascota eliminada con éxito", HttpStatus.OK);
    }

    @PutMapping("/mascota/editar")
    public ResponseEntity<Mascota> editMascota(@RequestBody Mascota mascota) {
        mascoService.editMascota(mascota);
        Mascota mascotaActualizada = mascoService.findMascota(mascota.getId_mascota());
        return new ResponseEntity<>(mascotaActualizada, HttpStatus.OK);
    }

}
