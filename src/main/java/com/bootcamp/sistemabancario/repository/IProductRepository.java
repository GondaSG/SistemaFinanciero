package com.bootcamp.sistemabancario.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.sistemabancario.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IProductRepository extends ReactiveCrudRepository<Product,ObjectId> {
	
	  Flux<Product> findById(String id);
	
	  Flux<Product> findAll();
	  
	  Mono<Product> insert(Product product);
	  
	  Mono<Product> findAll(Product product);
	  
	  void deleteById(String id);
}
