package com.bootcamp.sistemabancario.service.impl;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.service.IClienteValidatorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EnterpriseService implements IClienteValidatorService  {

	@Override
	public Mono<Boolean> Validator(Flux<Account> accounts) {
		// TODO Auto-generated method stub
		return null;
	}

}
