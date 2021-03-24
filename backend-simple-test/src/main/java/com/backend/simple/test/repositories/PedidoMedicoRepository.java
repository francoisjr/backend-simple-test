package com.backend.simple.test.repositories;

import com.backend.simple.test.domain.PedidoMedico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoMedicoRepository extends JpaRepository<PedidoMedico, Long> {
}
