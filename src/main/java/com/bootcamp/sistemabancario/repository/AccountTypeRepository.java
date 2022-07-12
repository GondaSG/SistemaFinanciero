package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.AccountType;
import com.bootcamp.sistemabancario.domain.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface AccountTypeRepository extends ReactiveCrudRepository<AccountType,ObjectId> {
    Mono<AccountType> findById(String id);

    Flux<AccountType> findAll();

    Mono<AccountType> insert(AccountType accountType);

    Mono<AccountType> findAll(AccountType accountType);

    void deleteById(String id);
}
