package com.bootcamp.sistemabancario.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.sistemabancario.domain.OperationType;
import com.bootcamp.sistemabancario.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOperationTypeRepository extends ReactiveCrudRepository<OperationType,ObjectId>{
	  Mono<OperationType> findById(String id);
		
	  Flux<OperationType> findAll();
	  
	  Mono<OperationType> insert(OperationType operationType);
	  
	  Mono<OperationType> findAll(OperationType operationType);
	  
	  void deleteById(String id);
}
