package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import com.bootcamp.sistemabancario.service.ITransactionRecordService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/transactionrecord")
public class TransactionRecordController {

    private ITransactionRecordService transactionRecordService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping
    public Flux<TransactionRecord> findAll(){
        LOGGER.info("getAll" + "OK");
        return transactionRecordService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<TransactionRecord> getById(@PathVariable("id") ObjectId id){
        LOGGER.info("getById" + "OK");
        return transactionRecordService.findById(id);
    }

    @PostMapping
    public Mono<TransactionRecord> create(@RequestBody TransactionRecord transactionRecord){
        LOGGER.info("create" + "OK");
        return transactionRecordService.save(transactionRecord);
    }
    @PutMapping
    public Mono<TransactionRecord> update(@RequestBody TransactionRecord transactionRecord){
        LOGGER.info("update" + "OK");
        return  transactionRecordService.save(transactionRecord);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id")ObjectId id){
        LOGGER.info("deleteById" + "OK");
        return transactionRecordService.deleteById(id);
    }
}
