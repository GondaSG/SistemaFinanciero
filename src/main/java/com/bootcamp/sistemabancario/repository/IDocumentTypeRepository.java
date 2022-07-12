package com.bootcamp.sistemabancario.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDocumentTypeRepository extends ReactiveCrudRepository<DocumentType,ObjectId> {
}
