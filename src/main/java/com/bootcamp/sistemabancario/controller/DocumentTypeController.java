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

import com.bootcamp.sistemabancario.domain.DocumentType;
import com.bootcamp.sistemabancario.service.IDocumentTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/afiliados")
public class DocumentTypeController {

    @Autowired
    private IDocumentTypeService repo;

    @GetMapping
    public Flux<DocumentType> listar(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Mono<DocumentType> getById(@PathVariable("id") String id){
        return  repo.findById(id);
    }

    @PostMapping
    public Mono<DocumentType> registrar(@RequestBody DocumentType afiliado){
        return repo.save(afiliado);
    }

    @PutMapping
    public Mono<DocumentType> modificar(@RequestBody DocumentType afiliado){
        return repo.update(afiliado);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return repo.deleteById(id);
    }
}
