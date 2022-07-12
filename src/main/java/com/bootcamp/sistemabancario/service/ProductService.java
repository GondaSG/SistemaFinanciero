package com.bootcamp.sistemabancario.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.sistemabancario.domain.OperationType;
import com.bootcamp.sistemabancario.domain.Product;
import com.bootcamp.sistemabancario.repository.IOperationTypeRepository;
import com.bootcamp.sistemabancario.repository.IProductRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

	@Autowired
	private final IProductRepository productRepository;
	
	@Override
	public Flux<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Mono<Product> findById(ObjectId id) { 
		return productRepository.findById(id);
	}

	@Override
	public Mono<Product> save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Mono<Product> update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Mono<Void> deleteById(ObjectId id) {
		return productRepository.deleteById(id);
	}
}
