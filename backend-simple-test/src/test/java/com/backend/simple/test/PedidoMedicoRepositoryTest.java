package com.backend.simple.test;

import com.backend.simple.test.domain.Exame;
import com.backend.simple.test.domain.Medico;
import com.backend.simple.test.domain.Paciente;
import com.backend.simple.test.domain.PedidoMedico;
import com.backend.simple.test.repositories.PedidoMedicoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PedidoMedicoRepositoryTest {

    @Autowired
    private PedidoMedicoRepository pedidoMedicoRepository;

    @Test
    public void QuandoCriar_EntaoPersistirDadosTest(){
        Paciente paciente = new Paciente(null, "Francisco Junior", Instant.parse("1993-09-02T19:53:07Z"),"Masculino",
                "Jacira Silva", "Rua Bento Camargo, 212", "11964617707", "francisdsj@gfmail.com", "4369848288", "434464068");


        Medico medico = new Medico(null, "Carlos Silva", 201212585, "Ativo","CRM");

        List<Exame> exames = Arrays.asList(new Exame(null, "Exame de sangue", Instant.parse("2021-03-30T19:53:07Z")),
                new Exame(null,"Exame de urina",Instant.parse("2022-03-02T19:53:07Z")),
                new Exame(null,"Exame de covid",Instant.parse("2022-03-02T19:53:07Z")));


        PedidoMedico pedidoMedico = new PedidoMedico(null, medico, paciente, exames);

        this.pedidoMedicoRepository.save(pedidoMedico);

        assertThat(pedidoMedico.getId()).isNotNull();
        assertThat(pedidoMedico.getPaciente().getNome()).isEqualTo("Francisco Junior");
        assertThat(pedidoMedico.getMedico().getNumeroConselho()).isEqualTo(201212585);
        assertThat(pedidoMedico.getExames().size()).isEqualTo(3);
    }



}
