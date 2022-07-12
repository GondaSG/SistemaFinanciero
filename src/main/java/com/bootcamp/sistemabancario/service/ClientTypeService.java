package com.bootcamp.sistemabancario.service;
import com.bootcamp.sistemabancario.repository.ClientTypeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.sistemabancario.domain.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientTypeService implements IClientTypeService {
    @Autowired
    private ClientTypeRepository clientTypeRepository;
    @Override
    public Flux<ClientType> findAll() {
        return clientTypeRepository.findAll();
    }

    @Override
    public Mono<ClientType> findById(ObjectId id) {
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
    public Mono<Void> deleteById(ObjectId id) {
        return clientTypeRepository.deleteById(id);
    }
}

