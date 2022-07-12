package com.bootcamp.sistemabancario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.repository.IAccountTypeRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountTypeService implements IAccountTypeService{
    @Autowired
    private final IAccountTypeRepository accountTypeRepository;
    @Override
    public Flux<AccountType> findAll() {
        return accountTypeRepository.findAll();
    }

    @Override
    public Mono<AccontType> findById(String id) {
        return accountTypeRepository.findById(id);
    }

    @Override
    public Mono<DocumentType> save(DocumentType documentType) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<AccountType> update(AccountType accountType) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

}
