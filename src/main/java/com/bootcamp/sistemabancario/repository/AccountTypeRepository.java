package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.AccountType;

public interface AccountTypeRepository extends ReactiveCrudRepository<AccountType,ObjectId> {

}
