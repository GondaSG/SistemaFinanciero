package com.bootcamp.sistemabancario.repository;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.sistemabancario.domain.ClientType;

public interface ClientTypeRepository extends ReactiveCrudRepository<ClientType,ObjectId>{

}
