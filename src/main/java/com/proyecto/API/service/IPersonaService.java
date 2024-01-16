package com.proyecto.API.service;

import com.proyecto.API.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();

  public  Persona findPersona(Long id);


   public void savePersona(Persona persona);


   public  void  deletePersona(Long id);


    public  void edit(Persona persona);


    

}
