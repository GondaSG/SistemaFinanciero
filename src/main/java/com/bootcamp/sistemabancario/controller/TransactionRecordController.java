package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import com.bootcamp.sistemabancario.repository.ITransactionRecordRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/transaction")
public class TransactionRecordController {

    private ITransactionRecordRepository transactionRecordRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping
    public Flux<TransactionRecord> findAll(){
        LOGGER.info("getAll" + "OK");
        return transactionRecordRepository.findAll();
    }

    @GetMapping
    public Mono<TransactionRecord> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
        return transactionRecordRepository.findById(id);
    }

    @PostMapping
    public Mono<TransactionRecord> create(@RequestBody TransactionRecord transactionRecord){
        LOGGER.info("create" + "OK");
        return transactionRecordRepository.save(transactionRecord);
    }
    @PutMapping
    public Mono<TransactionRecord> update(@RequestBody TransactionRecord transactionRecord){
        LOGGER.info("update" + "OK");
        return  transactionRecordRepository.save(transactionRecord);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id")String id){
        LOGGER.info("deleteById" + "OK");
        return transactionRecordRepository.deleteById(id);
    }
}
