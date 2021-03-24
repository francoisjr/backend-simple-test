package com.backend.simple.test;


import com.backend.simple.test.domain.Exame;
import com.backend.simple.test.domain.Medico;
import com.backend.simple.test.domain.Paciente;
import com.backend.simple.test.domain.PedidoMedico;
import com.backend.simple.test.repositories.ExameRepository;
import com.backend.simple.test.repositories.MedicoRepository;
import com.backend.simple.test.repositories.PacienteRepository;
import com.backend.simple.test.repositories.PedidoMedicoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PedidoMedicoEndpointTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ExameRepository exameRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PedidoMedicoRepository pedidoMedicoRepository;

    @Autowired
    private TestRestTemplate restTemplate;



    @Test
    public void whenCreatingUsingCorrectFunction_thenReturnStatusCode200() throws Exception {

       Paciente paciente = new Paciente(1L, "Francisco Junior", null,"Masculino",
                "Jacira Silva", "Rua Bento Camargo, 212", "11964617707", "francisdsj@gfmail.com", "4369848288", "434464068");


        Medico medico = new Medico(1l, "Carlos Silva", 201212585, "Ativo","CRM");

        List<Exame> exames = Arrays.asList(new Exame(1l, "Exame de sangue", null),
                new Exame(2l,"Exame de urina",null),
                new Exame(3l,"Exame de covid",null));


        PedidoMedico pedidoMedico = new PedidoMedico(1l, medico, paciente, exames);



        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(pedidoMedico);


        mockMvc.perform(post("http://localhost:8080/pedidos").contentType(MediaType.APPLICATION_JSON).content(jsonString))
                .andExpect(status().isOk())
                .andDo(print());
    }


}
