package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClienteValidatorService {
	Mono<Account> Validator (Mono<Account> accounts);
}
