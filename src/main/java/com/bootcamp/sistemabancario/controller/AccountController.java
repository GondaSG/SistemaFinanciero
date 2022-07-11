package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.Account;
import com.bootcamp.sistemabancario.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping(path = "account",produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAll(){
        LOGGER.info("getAll" + "OK");
        return accountRepository.findAll();
    }

    @PostMapping(path = "account")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Account account){
        LOGGER.info("Create" + "OK");
        accountRepository.save(account);
    }

    @GetMapping(path = "account/{id}",produces = {"application/json"})
    public ResponseEntity<Account> getById(@PathVariable(value = "id")Long id){
        LOGGER.info("Hizo la peticion de obtener por ID");
        Optional<Account> account = accountRepository.findById(id);
        if(account.isPresent()){
            return new ResponseEntity<>(account.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(account.get(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping({"account/{id}"})
    public void delete(@PathVariable("id") Long id){
        LOGGER.info("Hizo la peticion eliminar por Id");
        accountRepository.deleteById(id);
    }

    @PutMapping(path = {"account/{id}"},produces = {"application/json"})
    public Account update(
            @RequestBody Account account,
            @PathVariable(value = "id")ObjectId id){
        LOGGER.info("Hizo la peticion por ID");
        account.setId(id);
        accountRepository.save(account);
        return account;
    }
}
