package com.bootcamp.sistemabancario.service.impl;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.repository.IAccountRepository;
import com.bootcamp.sistemabancario.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {

    @Autowired
    private final IAccountRepository accountRepository;
    @Override
    public Flux<Account> findAll() {return accountRepository.findAll();}

    @Override
    public Mono<Account> findById(ObjectId id) {return accountRepository.findById(id);}

    @Override
    public Mono<Account> save(Account account) {return accountRepository.save(account);}

    @Override
    public Mono<Account> update(Account account) {return accountRepository.save(account);}

    @Override
    public Mono<Void> deleteById(ObjectId id) {return accountRepository.deleteById(id);}
}
