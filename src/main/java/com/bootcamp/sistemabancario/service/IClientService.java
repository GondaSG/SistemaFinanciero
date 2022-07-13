package com.bootcamp.sistemabancario.service;
import org.bson.types.ObjectId;
import com.bootcamp.sistemabancario.domain.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
    Flux<Client> findAll();

    Mono<Client> findById(String id);

    Mono<Client> save(Client client);

    Mono<Client> update(Client client);

    Mono<Void> deleteById(String id);
}