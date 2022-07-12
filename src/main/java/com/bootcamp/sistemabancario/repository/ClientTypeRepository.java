package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientTypeRepository extends ReactiveCrudRepository<ClientType,ObjectId>{
    Mono<ClientType> findById(String id);

    Flux<ClientType> findAll();

    Mono<ClientType> insert(ClientType clientType);

    Mono<ClientType> findAll(ClientType clientType);

    void deleteById(String id);
}
