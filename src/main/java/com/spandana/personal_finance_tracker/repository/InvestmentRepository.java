package com.spandana.personal_finance_tracker.repository;

import java.util.List;

import com.spandana.personal_finance_tracker.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
    List<Investment> findByType(String type);


}
