package com.proyecto.API.service;

import com.proyecto.API.model.Mascota;
import com.proyecto.API.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascoRepository;
    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> mascotas = mascoRepository.findAll();
        return  mascotas;
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = mascoRepository.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void saveMascota(Mascota masco) {

        mascoRepository.save(masco);

    }

    @Override
    public void deleteMascota(Long id) {
     mascoRepository.deleteById(id);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }


}
