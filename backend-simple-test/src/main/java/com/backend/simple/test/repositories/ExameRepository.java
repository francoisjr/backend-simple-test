package com.backend.simple.test.repositories;

import com.backend.simple.test.domain.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExameRepository extends JpaRepository<Exame, Long> {
}
