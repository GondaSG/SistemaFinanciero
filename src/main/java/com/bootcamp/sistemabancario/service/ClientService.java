package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.Client;

import com.bootcamp.sistemabancario.domain.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ClientService implements IClientService {

    @Override
    public Flux<Client> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Client> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Client> save(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Client> update(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

}
