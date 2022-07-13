package com.bootcamp.sistemabancario.service.impl;
import com.bootcamp.sistemabancario.repository.IClientTypeRepository;
import com.bootcamp.sistemabancario.service.IClientTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.sistemabancario.domain.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientTypeService implements IClientTypeService {
    @Autowired
    private IClientTypeRepository clientTypeRepository;
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
    public Mono<ClientType> update(ClientType clientType) {
        return clientTypeRepository.save(clientType);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return clientTypeRepository.deleteById(id);
    }
}

