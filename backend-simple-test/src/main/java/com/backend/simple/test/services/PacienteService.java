package com.backend.simple.test.services;

import com.backend.simple.test.domain.Paciente;
import com.backend.simple.test.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente insert(Paciente paciente){
        return  pacienteRepository.save(paciente);
    }
}
