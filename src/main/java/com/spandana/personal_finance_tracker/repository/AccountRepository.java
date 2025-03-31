package com.spandana.personal_finance_tracker.repository;


import com.spandana.personal_finance_tracker.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountName(String accountName);
}
