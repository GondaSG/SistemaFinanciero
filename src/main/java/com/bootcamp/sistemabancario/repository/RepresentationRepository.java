package com.bootcamp.sistemabancario.repository;


import com.bootcamp.sistemabancario.domain.Representation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepresentationRepository extends MongoRepository<Representation,Long> {
}
