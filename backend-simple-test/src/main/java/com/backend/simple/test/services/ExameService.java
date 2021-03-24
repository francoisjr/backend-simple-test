package com.backend.simple.test.services;

import com.backend.simple.test.domain.Exame;
import com.backend.simple.test.repositories.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExameService {

    @Autowired
    private ExameRepository exameRepository;

    public List<Exame> insert(List<Exame> exames){
        return  exameRepository.saveAll(exames);
    }
}
