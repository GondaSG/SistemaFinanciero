package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRecordRepository extends MongoRepository<TransactionRecord,Long> {
}
