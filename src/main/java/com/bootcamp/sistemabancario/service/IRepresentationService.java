package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.domain.Representation;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRepresentationService {

    Flux<Representation> findAll();

    Mono<Representation> findById(ObjectId id);

    Mono<Representation> save(Representation representation);

    Mono<Representation> update(Representation representation);

    public Mono<Void> deleteById(ObjectId id);
}
