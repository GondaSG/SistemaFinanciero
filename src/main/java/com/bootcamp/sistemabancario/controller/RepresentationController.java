package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.Representation;
import com.bootcamp.sistemabancario.repository.RepresentationRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/v1")
public class RepresentationController {

    @Autowired
    private RepresentationRepository representationRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping(path = "representation",produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<Representation> getAll(){
        LOGGER.info("gelAll" + "OK");
        return representationRepository.findAll();
    }

    @PostMapping(path = "representation")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Representation representation){
        LOGGER.info("create" + "OK");
        representationRepository.save(representation);
    }

    @GetMapping(path = "representation/{id}",produces = {"application/json"})
    public ResponseEntity<Representation> getById(@PathVariable(value = "id") Long id){
        LOGGER.info("Hizo la peticion de obtener por Id");
        Optional<Representation> representation = representationRepository.findById(id);
        if(representation.isPresent()){
            return new ResponseEntity<>(representation.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(representation.get(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping({"representacion/{id}"})
    public void delete(@PathVariable("id") Long id){
        LOGGER.info("Hizo la petición eliminar por Id");
        representationRepository.deleteById(id);
    }

    @PutMapping(path = { "representation/{id}" },produces = { "application/json" })
    public Representation update(
            @RequestBody Representation representation,
            @PathVariable(value = "id") ObjectId id){
        LOGGER.info("Hizo la peticion por Id");
        representation.setId(id);
        representationRepository.save(representation);
        return representation;
    }
}
