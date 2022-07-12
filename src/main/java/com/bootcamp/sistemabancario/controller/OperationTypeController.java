package com.bootcamp.sistemabancario.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.sistemabancario.domain.OperationType;
import com.bootcamp.sistemabancario.service.IOperationTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/afiliados")
public class OperationTypeController {
    @Autowired
    private IOperationTypeService repo;

    @GetMapping
    public Flux<OperationType> listar(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Mono<OperationType> getById(@PathVariable("id") String id){
        return  repo.findById(id);
    }

    @PostMapping
    public Mono<OperationType> registrar(@RequestBody OperationType operationType){
        return repo.save(operationType);
    }

    @PutMapping
    public Mono<OperationType> modificar(@RequestBody OperationType operationType){
        return repo.update(operationType);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return repo.deleteById(id);
    }
}
