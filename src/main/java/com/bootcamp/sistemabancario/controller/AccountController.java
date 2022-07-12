package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.repository.IAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    private IAccountRepository accountRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @GetMapping
    public Flux<Account> findAll(){
        LOGGER.info("getAll" + "OK");
        return accountRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Account> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
        return accountRepository.findById(id);
    }

    @PostMapping
    public Mono<Account> create(@RequestBody Account account){
        LOGGER.info("create" + "OK");
        return accountRepository.save(account);
    }

    @PutMapping
    public Mono<Account> update(@RequestBody Account account){
        LOGGER.info("update" + "OK");
        return accountRepository.update(account);
    }
    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        LOGGER.info("deleteById" + "OK");
        return accountRepository.deleteById(id);
    }

}
