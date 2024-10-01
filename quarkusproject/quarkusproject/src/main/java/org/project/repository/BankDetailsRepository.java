package org.project.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.project.entity.BankDetails;

@ApplicationScoped
public class BankDetailsRepository implements PanacheRepository<BankDetails>{

    public BankDetails findByBankAccountNumber(Long bankAccountNumber) {
        return find("bankAccountNumber", bankAccountNumber).firstResult();
    }
}