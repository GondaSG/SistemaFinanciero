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
import com.bootcamp.sistemabancario.domain.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClientTypeController {

    @Autowired
    private ClientTypeController cliente;

    @GetMapping
    public Flux<ClientType> listar(){
        return cliente.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ClientType> getById(@PathVariable("id") String id){return  cliente.findById(id);
    }

    @PostMapping
    public Mono<ClientType> registrar(@RequestBody ClientType cliente){
        return cliente.save(cliente);
    }

    @PutMapping
    public Mono<ClientType> modificar(@RequestBody ClientType cliente){
        return cliente.update(cliente);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return cliente.deleteById(id);
    }
}
