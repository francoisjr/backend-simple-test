package com.backend.simple.test.config;

import com.backend.simple.test.domain.Exame;
import com.backend.simple.test.domain.Medico;
import com.backend.simple.test.domain.Paciente;
import com.backend.simple.test.domain.PedidoMedico;
import com.backend.simple.test.repositories.ExameRepository;
import com.backend.simple.test.repositories.MedicoRepository;
import com.backend.simple.test.repositories.PacienteRepository;
import com.backend.simple.test.repositories.PedidoMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;


    @Autowired
    private ExameRepository exameRepository;

    @Autowired
    private PedidoMedicoRepository pedidoMedicoRepository;

    @Override
    public void run(String... args) throws Exception {
        Paciente paciente = new Paciente(null, "Francisco", Instant.parse("1993-09-02T19:53:07Z"),"Masculino",
                "Jacira Silva", "Rua Bento Camargo, 212", "11964617707", "francisdsj@gfmail.com", "4369848288", "434464068");

        Paciente paciente2 = new Paciente(null, "Francisco 2", Instant.parse("1993-09-02T19:53:07Z"),"Masculino",
                "Jacira Silva", "Rua Bento Camargo, 212", "11964617707", "francisdsj@gfmail.com", "4369848288", "434464068");

        Medico medico = new Medico(null, "Carlos Perereira", 201212585, "Ativo","CRM");

        List<Exame> exames = Arrays.asList(new Exame(null, "Exame de sangue", Instant.parse("2021-03-30T19:53:07Z")),
                new Exame(null,"Exame de urina",Instant.parse("2022-03-02T19:53:07Z")),
                        new Exame(null,"Exame de covid",Instant.parse("2022-03-02T19:53:07Z")));


        PedidoMedico pedidoMedico = new PedidoMedico(null, medico, paciente, exames);

       /* pacienteRepository.save(paciente);
        medicoRepository.save(medico);
        exameRepository.saveAll(exames);

        PedidoMedico pedidoMedico1 = pedidoMedicoRepository.save(pedidoMedico);
*/
        //pacienteRepository.saveAll(Arrays.asList(paciente, paciente2));

       //System.out.println("Pedido medico gravado: "+ pedidoMedico1);

    }
}
