package com.bootcamp.sistemabancario.service.impl;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import com.bootcamp.sistemabancario.repository.ITransactionRecordRepository;
import com.bootcamp.sistemabancario.service.ITransactionRecordService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TransactionRecordService implements ITransactionRecordService {

    @Autowired
    private final ITransactionRecordRepository transactionRecordRepository;
    @Override
    public Flux<TransactionRecord> findAll() {return transactionRecordRepository.findAll();}

    @Override
    public Mono<TransactionRecord> findById(String id) {return transactionRecordRepository.findById(id);}

    @Override
    public Mono<TransactionRecord> save(TransactionRecord transactionRecord) {return transactionRecordRepository.save(transactionRecord);
    }

    @Override
    public Mono<TransactionRecord> update(TransactionRecord transactionRecord) {return transactionRecordRepository.save(transactionRecord);
    }

    @Override
    public Mono<Void> deleteById(String id) {return transactionRecordRepository.deleteById(id);}
}
