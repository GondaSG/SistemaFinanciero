package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ClientRepository extends ReactiveCrudRepository<Client,ObjectId> {

        Flux<Client> findById(String id);

        Flux<Client> findAll();

        Mono<Client> insert(Client client);

        Mono<Client> findAll(Client client);

        void deleteById(String id);
}
