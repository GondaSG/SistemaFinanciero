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
import com.bootcamp.sistemabancario.domain.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClientController {
    @Autowired
    private ClientController cliente;

    @GetMapping
    public Flux<Client> listar(){
        return cliente.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Client> getById(@PathVariable("id") String id){
        return  cliente.findById(id);
    }

    @PostMapping
    public Mono<Client> registrar(@RequestBody Client client){
        return cliente.save(cliente);
    }

    @PutMapping
    public Mono<Client> modificar(@RequestBody Client product){
        return cliente.update(product);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return cliente.deleteById(id);
    }
}
