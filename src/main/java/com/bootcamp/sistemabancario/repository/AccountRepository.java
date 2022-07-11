package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,Long> {
}
