package com.bootcamp.sistemabancario.service;

import com.bootcamp.sistemabancario.domain.Representation;
import com.bootcamp.sistemabancario.repository.IRepresentationRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RepresentationService implements IRepresentationService{

    @Autowired
    private final IRepresentationRepository representationRepository;
    @Override
    public Flux<Representation> findAll() {return representationRepository.findAll();}

    @Override
    public Mono<Representation> findById(ObjectId id) {return representationRepository.findById(id);}

    @Override
    public Mono<Representation> save(Representation representation) {return representationRepository.save(representation);}

    @Override
    public Mono<Representation> update(Representation representation) {return representationRepository.save(representation);}

    @Override
    public Mono<Void> deleteById(ObjectId id) {return representationRepository.deleteById(id);}
}
