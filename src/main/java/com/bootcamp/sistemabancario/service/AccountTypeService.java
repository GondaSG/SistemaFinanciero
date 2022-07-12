package com.bootcamp.sistemabancario.service;
import com.bootcamp.sistemabancario.domain.AccountType;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.sistemabancario.repository.AccountTypeRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountTypeService implements IAccountTypeService {
    @Autowired
    private AccountTypeRepository accountTypeRepository;
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