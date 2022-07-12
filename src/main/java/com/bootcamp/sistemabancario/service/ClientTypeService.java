package com.bootcamp.sistemabancario.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.domain.ClientType;
import com.bootcamp.sistemabancario.repository.IOperationTypeRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientTypeService implements IClientTypeService {

    @Autowired
    private final IClientTypeRepository clientTypeRepository;

    @Override
    public Flux<ClientType> findAll() {
        return clientTypeRepository.findAll();
    }

    @Override
    public Mono<ClientType> findById(String id) {
        return clientTypeRepository.findById(id);
    }

    @Override
    public Mono<ClientType> save(ClientType clientType) {
        return clientTypeRepository.save(clientType);
    }

    @Override
    public Mono<ClientType> update(ClientType operationType) {
        return clientTypeRepository.save(operationType);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        // TODO Auto-generated method stub
        return clientTypeRepository.deleteById(id);
    }

}

