package com.bootcamp.sistemabancario.controller;

import org.bson.types.ObjectId;
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
@RequestMapping("/tipoDocumento")
public class DocumentTypeController {

    @Autowired
    private IDocumentTypeService iDocumentTypeService;

    @GetMapping
    public Flux<DocumentType> getAll(){
        return iDocumentTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<DocumentType> getById(@PathVariable("id") ObjectId id){
        return  iDocumentTypeService.findById(id);
    }

    @PostMapping
    public Mono<DocumentType> create(@RequestBody DocumentType afiliado){
        return iDocumentTypeService.save(afiliado);
    }

    @PutMapping
    public Mono<DocumentType> update(@RequestBody DocumentType afiliado){
        return iDocumentTypeService.update(afiliado);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") ObjectId id){
        return iDocumentTypeService.deleteById(id);
    }
}
