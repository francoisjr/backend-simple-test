package com.backend.simple.test.repositories;

import com.backend.simple.test.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
