package com.bootcamp.sistemabancario.service.impl;
import com.bootcamp.sistemabancario.domain.AccountType;
import com.bootcamp.sistemabancario.repository.IAccountTypeRepository;
import com.bootcamp.sistemabancario.service.IAccountTypeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountTypeService implements IAccountTypeService {
    @Autowired
    private IAccountTypeRepository accountTypeRepository;
    @Override
    public Flux<AccountType> findAll() {
        return accountTypeRepository.findAll();
    }

    @Override
    public Mono<AccountType> findById(ObjectId id) {
        return accountTypeRepository.findById(id);
    }

    @Override
    public Mono<AccountType> save(AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    @Override
    public Mono<AccountType> update(AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    @Override
    public Mono<Void> deleteById(ObjectId id) {
        return accountTypeRepository.deleteById(id);
    }
}