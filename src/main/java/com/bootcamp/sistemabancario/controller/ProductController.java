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

import com.bootcamp.sistemabancario.domain.Product;
import com.bootcamp.sistemabancario.service.IProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/producto")
public class ProductController {
    @Autowired
    private IProductService repo;

    @GetMapping
    public Flux<Product> listar(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getById(@PathVariable("id") String id){
        return  repo.findById(id);
    }

    @PostMapping
    public Mono<Product> registrar(@RequestBody Product product){
        return repo.save(product);
    }

    @PutMapping
    public Mono<Product> modificar(@RequestBody Product product){
        return repo.update(product);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return repo.deleteById(id);
    }
}
