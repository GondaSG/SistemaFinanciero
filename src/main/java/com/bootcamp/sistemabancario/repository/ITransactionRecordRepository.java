package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ITransactionRecordRepository extends ReactiveCrudRepository<TransactionRecord, String> {

}
