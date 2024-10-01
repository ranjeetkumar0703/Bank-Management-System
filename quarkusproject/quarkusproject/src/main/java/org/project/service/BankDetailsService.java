package org.project.service;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.project.entity.BankDetails;
import org.project.repository.BankDetailsRepository;

import java.util.List;

public class BankDetailsService {

    @Inject BankDetailsRepository bankDetailsRepository;

    public BankDetails fetchBankDetails(Long bankAccountNumber) {
        return bankDetailsRepository.findByBankAccountNumber(bankAccountNumber);
    }

    public List<BankDetails> listAll() {
        return bankDetailsRepository.listAll();
    }

    public BankDetails findById(Long id) {
        return bankDetailsRepository.findById(id);
    }

    @Transactional
    public void persist(BankDetails bankDetails) {
        bankDetailsRepository.persist(bankDetails);
    }

    @Transactional
    public void delete(BankDetails bankDetails) {
        bankDetailsRepository.delete(bankDetails);
    }
}
