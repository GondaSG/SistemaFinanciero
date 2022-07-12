package com.bootcamp.sistemabancario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.repository.IDocumentTypeRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DocumentTypeService implements IDocumentTypeService{
	@Autowired
	private final IDocumentTypeRepository documentTypeRepository;
	@Override
	public Flux<DocumentType> findAll() {
		return documentTypeRepository.findAll();
	}

	@Override
	public Mono<DocumentType> findById(String id) { 
		return documentTypeRepository.findById(id);
	}

	@Override
	public Mono<DocumentType> save(DocumentType documentType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<DocumentType> update(DocumentType documentType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
