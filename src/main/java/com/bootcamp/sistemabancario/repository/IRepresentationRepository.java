package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.domain.Representation;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRepresentationRepository extends ReactiveCrudRepository<Representation, ObjectId> {

    Mono<Representation> findById(String id);

    Flux<Representation> findAll();

    Mono<Representation> create(Representation representation);

    Mono<Representation> update(Representation representation);

    Mono<Void> deleteById(String id);
}
