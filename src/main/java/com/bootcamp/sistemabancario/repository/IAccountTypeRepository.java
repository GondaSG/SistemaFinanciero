package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.AccountType;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IAccountTypeRepository extends ReactiveCrudRepository<AccountType, ObjectId> {
}
