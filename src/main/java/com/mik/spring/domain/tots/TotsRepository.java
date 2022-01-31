package com.mik.spring.domain.tots;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TotsRepository extends JpaRepository<Tots, Long> {
}