package com.proyecto.API.service;

import com.proyecto.API.model.Mascota;


import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public  Mascota findMascota(Long id);


    public void saveMascota(Mascota masco);


    public  void  deleteMascota(Long id);

    public  void  editMascota(Long id , String newName, String newSpecies,String newRace,String newColor);
}



