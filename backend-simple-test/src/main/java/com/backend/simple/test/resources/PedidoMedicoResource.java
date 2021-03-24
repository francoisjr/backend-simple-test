package com.backend.simple.test.resources;

import com.backend.simple.test.domain.PedidoMedico;
import com.backend.simple.test.services.ExameService;
import com.backend.simple.test.services.MedicoService;
import com.backend.simple.test.services.PacienteService;
import com.backend.simple.test.services.PedidoMedicoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"Endpoint de Cadastro"})
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoMedicoResource {

    @Autowired
    private ExameService exameService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private PedidoMedicoService pedidoMedicoService;

    @ApiOperation(value = "Este endpoint tem como objetivo realizar o cadastro de um pedido médico de uma pessoa")
    @PostMapping
    public ResponseEntity<PedidoMedico> insert(@RequestBody PedidoMedico pedidoMedico){

        medicoService.insert(pedidoMedico.getMedico());
        pacienteService.insert(pedidoMedico.getPaciente());
        exameService.insert( pedidoMedico.getExames());
        pedidoMedicoService.insert(pedidoMedico);

        return ResponseEntity.ok().body(pedidoMedico);
    }

    @ApiOperation(value = "Este endpoint tem como objetivo realizar a busca de todos os pedidos médicos cadastrados no sistema")
    @GetMapping
    public ResponseEntity<List<PedidoMedico>> findAll(){

        List<PedidoMedico> list = pedidoMedicoService.findAll();

        return ResponseEntity.ok().body(list);
    }
}