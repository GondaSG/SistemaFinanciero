package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.domain.Representation;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRepresentationRepository extends ReactiveCrudRepository<Representation, ObjectId> {

}
