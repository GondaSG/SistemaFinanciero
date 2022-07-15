package com.bootcamp.sistemabancario.service.impl;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.service.IClienteValidatorService;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonService implements IClienteValidatorService{

	@Override
	public Mono<Boolean> Validator(Flux<Account> accounts) {
		return null;
	}

}
