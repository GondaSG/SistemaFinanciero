package com.bootcamp.sistemabancario.service;

import org.bson.types.ObjectId;

import com.bootcamp.sistemabancario.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {
	Flux<Product> findAll();
	
	Mono<Product> findById(ObjectId id);

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);
    
    public Mono<Void> deleteById(ObjectId id);
}