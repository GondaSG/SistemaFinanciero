package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.Account;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountRepository extends ReactiveCrudRepository<Account, ObjectId> {

    Mono<Account> findById(String id);

    Flux<Account> finAll();

    Mono<Account> create(Account account);

    Mono<Account> update(Account account);

    Mono<Void> deleteById(String id);
}
