package com.bootcamp.sistemabancario.controller;
import com.bootcamp.sistemabancario.service.IAccountTypeService;
import com.bootcamp.sistemabancario.service.IClientService;
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
import com.bootcamp.sistemabancario.domain.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService iClientService;


    @GetMapping
    public Flux<Client> findAll(){
        return iClientService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Client> getById(@PathVariable("id") String id){
        return  iClientService.findById(id);
    }

    @PostMapping
    public Mono<Client> create(@RequestBody Client client){
        return iClientService.save(client);
    }

    @PutMapping
    public Mono<Client> update(@RequestBody Client product){
        return iClientService.update(product);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") ObjectId id){
        return iClientService.deleteById(id);
    }
}
