package com.bootcamp.sistemabancario.repository;

import com.bootcamp.sistemabancario.domain.ClientType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IClientTypeRepository extends ReactiveCrudRepository<ClientType,String> {
}
