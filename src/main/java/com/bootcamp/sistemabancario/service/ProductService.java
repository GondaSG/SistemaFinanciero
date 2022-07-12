package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductService implements IProductService {

	@Override
	public Flux<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Product> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Product> save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Product> update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
