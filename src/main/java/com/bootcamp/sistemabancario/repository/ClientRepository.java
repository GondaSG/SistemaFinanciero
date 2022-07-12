package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.Client;

public interface ClientRepository extends ReactiveCrudRepository<Client,ObjectId> {

}
