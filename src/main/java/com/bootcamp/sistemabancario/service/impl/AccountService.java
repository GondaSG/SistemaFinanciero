package com.bootcamp.sistemabancario.service.impl;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.domain.Client;
import com.bootcamp.sistemabancario.repository.IAccountRepository;
import com.bootcamp.sistemabancario.repository.IClientRepository;
import com.bootcamp.sistemabancario.service.IAccountService;
import com.bootcamp.sistemabancario.service.IClienteValidatorService;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {

    @Autowired
    private final IAccountRepository accountRepository;
    @Autowired
    private final IClientRepository iClientRepository;
    @Autowired
    private final ClientService clienteService;
    @Override
    public Flux<Account> findAll() {return accountRepository.findAll();}

    @Override
    public Mono<Account> findById(String id) {return accountRepository.findById(id);}

    @Override
    public Mono<Account> save(Account account) {
    	/*Mono<Client> client = iClientRepository.findById(account.getClient().getId());
    	accountRepository.findAll().filter(x-> x.getClient().getId().equals(account.getClient().getId()))
    								.flatMap(_account -> 
    									clienteService.validateClientType(client.map(x->x.getName()))
    										);*/
    	/*iClientRepository
    	.findById(account.getClient().getId())
    	.map(client -> clienteService.validateClientType(client.getName()).map(clientValidator ->
    	          clientValidator.Validator(findAll(x-> x.getClient().getId().equals(account.getClient().getId())))))
    	.mapflat(accunt_ -> clientValidator.Validator(findAll(x-> x.getClient().getId().equals(account.getClient().getId()))));
    	.flatMap(x -> {
    		Flux<IClientValidator> iClientValidator = Mono.just(x.getClientType().getId().get()) ->{
    			return 
    		}
    				})*/
    	//obtener cliente
    	//
    	//obtener cuentas del cliente existentes
    	//obtener 
    	return accountRepository.save(account);
    }

    @Override
    public Mono<Account> update(Account account) {return accountRepository.save(account);}

    @Override
    public Mono<Void> deleteById(String id) {return accountRepository.deleteById(id);}
}
