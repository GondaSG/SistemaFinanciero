package com.bootcamp.sistemabancario.service;
import com.bootcamp.sistemabancario.domain.ClientType;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientTypeService {
    Flux<ClientType> findAll();

    Mono<ClientType> findById(ObjectId id);

    Mono<ClientType> save(ClientType clientType);

    Mono<ClientType> update(ClientType clientType);

    Mono<Void> deleteById(ObjectId id);

}
