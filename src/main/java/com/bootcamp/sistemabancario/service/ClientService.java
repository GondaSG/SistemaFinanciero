package com.bootcamp.sistemabancario.service;
import com.bootcamp.sistemabancario.domain.Client;
import com.bootcamp.sistemabancario.repository.ClientRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findById(ObjectId id) {
        return clientRepository.findById(id);
    }

    @Override
    public Mono<Client> save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Client> update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Void> deleteById(ObjectId id) {
        return clientRepository.deleteById(id);
    }
}
