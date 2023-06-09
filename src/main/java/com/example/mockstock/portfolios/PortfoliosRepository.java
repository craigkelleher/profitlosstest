package com.example.mockstock.portfolios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PortfoliosRepository extends JpaRepository<Portfolios, Long> {
    Optional<Portfolios> findById(Long id);
}
