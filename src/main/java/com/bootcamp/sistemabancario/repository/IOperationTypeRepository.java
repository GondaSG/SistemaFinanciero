package com.bootcamp.sistemabancario.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.sistemabancario.domain.OperationType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOperationTypeRepository extends ReactiveCrudRepository<OperationType,ObjectId>{

}
