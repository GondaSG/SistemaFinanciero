package com.bootcamp.sistemabancario.controller;
import com.bootcamp.sistemabancario.service.impl.ClientTypeService;
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
@RequestMapping("/clienttype")
public class ClientTypeController {

    @Autowired
    private ClientTypeService clientTypeService;

    @GetMapping
    public Flux<ClientType> listar(){
        return clientTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ClientType> getById(@PathVariable("id") Integer id){return  clientTypeService.findById(id);
    }

    @PostMapping
    public Mono<ClientType> register(@RequestBody ClientType clientType){
        return clientTypeService.save(clientType);
    }

    @PutMapping
    public Mono<ClientType> update(@RequestBody ClientType clientType){
        return clientTypeService.update(clientType);
    }

    @DeleteMapping
    public Mono<Void> delete(@PathVariable("id") Integer id){
        return clientTypeService.deleteById(id);
    }
}
