package com.proyecto.API.service;

import com.proyecto.API.model.Persona;
import com.proyecto.API.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void savePersona(Persona perso) {
     persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
     persoRepo.deleteById(id);
    }



    @Override
    public void edit(Persona persona) {
        this.savePersona(persona);
    }


}
