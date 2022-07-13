package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.Representation;
import com.bootcamp.sistemabancario.repository.IRepresentationRepository;
import com.bootcamp.sistemabancario.service.IRepresentationService;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;


@RestController
@RequestMapping("/representation")
public class RepresentationController {

    @Autowired
    private IRepresentationService representationService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
   @GetMapping
    public Flux<Representation> findAll(){
       LOGGER.info("getAll" + "OK");
       return representationService.findAll();
   }

    @GetMapping("/{id}")
    public Mono<Representation> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
       return representationService.findById(id);
   }

    @PostMapping
    public Mono<Representation> create(@RequestBody Representation representation){
        LOGGER.info("create" + "OK");
       return representationService.save(representation);
   }

    @PutMapping
    public Mono<Representation> update(@RequestBody Representation representation){
        LOGGER.info("update" + "OK");
       return representationService.update(representation);
   }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        LOGGER.info("deleteById" + "OK");
       return representationService.deleteById(id);
   }
}
