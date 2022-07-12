package com.bootcamp.sistemabancario.service;
import com.bootcamp.sistemabancario.domain.AccountType;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountTypeService {
    Flux<AccountType> findAll();

    Mono<AccountType> findById(ObjectId id);

    Mono<AccountType> save(AccountType accountType);

    Mono<AccountType> update(AccountType accountType);

    Mono<Void> deleteById(ObjectId id);

}
