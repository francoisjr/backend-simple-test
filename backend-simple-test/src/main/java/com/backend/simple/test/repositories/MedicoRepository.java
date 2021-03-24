package com.backend.simple.test.repositories;

import com.backend.simple.test.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
