package com.backend.simple.test.services;

import com.backend.simple.test.domain.PedidoMedico;
import com.backend.simple.test.repositories.PedidoMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoMedicoService {

    @Autowired
    private PedidoMedicoRepository pedidoMedicoRepository;

    public List<PedidoMedico> findAll(){
        return pedidoMedicoRepository.findAll();
    }

    public PedidoMedico insert(PedidoMedico pedidoMedico){
        return  pedidoMedicoRepository.save(pedidoMedico);
    }
}