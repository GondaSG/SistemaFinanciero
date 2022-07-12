package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.Account;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountService {

    Flux<Account> findAll();

    Mono<Account> findById(ObjectId id);

    Mono<Account> save(Account account);

    Mono<Account> update(Account account);

    public Mono<Void> deleteById(ObjectId id);
}
