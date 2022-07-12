package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.Representation;
import com.bootcamp.sistemabancario.repository.IRepresentationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;


@RestController
@RequestMapping("/v1")
public class RepresentationController {

    @Autowired
    private IRepresentationRepository representationRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
   @GetMapping
    public Flux<Representation> findAll(){
       LOGGER.info("getAll" + "OK");
       return representationRepository.findAll();
   }

    @GetMapping("/{id}")
    public Mono<Representation> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
       return representationRepository.findById(id);
   }

    @PostMapping
    public Mono<Representation> create(@RequestBody Representation representation){
        LOGGER.info("create" + "OK");
       return representationRepository.save(representation);
   }

    @PutMapping
    public Mono<Representation> update(@RequestBody Representation representation){
        LOGGER.info("update" + "OK");
       return representationRepository.update(representation);
   }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        LOGGER.info("deleteById" + "OK");
       return representationRepository.deleteById(id);
   }
}
