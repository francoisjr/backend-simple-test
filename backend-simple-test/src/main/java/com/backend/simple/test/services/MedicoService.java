package com.backend.simple.test.services;

import com.backend.simple.test.domain.Medico;
import com.backend.simple.test.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico insert(Medico medico){
        return  medicoRepository.save(medico);
    }
}
