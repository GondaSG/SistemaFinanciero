package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.Client;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IClientRepository extends ReactiveCrudRepository<Client, String> {
}
