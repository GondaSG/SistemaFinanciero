package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionRecordService {

    Flux<TransactionRecord> findAll();

    Mono<TransactionRecord> findById(ObjectId id);

    Mono<TransactionRecord> save(TransactionRecord transactionRecord);

    Mono<TransactionRecord> update(TransactionRecord transactionRecord);

    public Mono<Void> deleteById(ObjectId id);
}
