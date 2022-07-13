package com.bootcamp.sistemabancario.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.sistemabancario.domain.DocumentType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDocumentTypeService {

	Flux<DocumentType> findAll();
	
	Mono<DocumentType> findById(String id);

    Mono<DocumentType> save(DocumentType documentType);

    Mono<DocumentType> update(DocumentType documentType);
    
    public Mono<Void> deleteById(String id);
}
