package com.bootcamp.sistemabancario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.domain.OperationType;
import com.bootcamp.sistemabancario.repository.IOperationTypeRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OperationTypeService implements IOperationTypeService {

	@Autowired
	private final IOperationTypeRepository operationTypeRepository;
	
	@Override
	public Flux<OperationType> findAll() {
		return operationTypeRepository.findAll();
	}

	@Override
	public Mono<OperationType> findById(String id) { 
		return operationTypeRepository.findById(id);
	}

	@Override
	public Mono<OperationType> save(OperationType operationType) {
		return operationTypeRepository.save(operationType);
	}

	@Override
	public Mono<OperationType> update(OperationType operationType) {
		return operationTypeRepository.save(operationType);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return operationTypeRepository.deleteById(id);
	}

}
