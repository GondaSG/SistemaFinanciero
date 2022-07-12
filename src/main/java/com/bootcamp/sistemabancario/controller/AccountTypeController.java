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
import com.bootcamp.sistemabancario.service.IDocumentTypeService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class AccountTypeController {

    @Autowired
    private IDocumentTypeService cliente;

    @GetMapping
    public Flux<AccountTypeController> listar(){
        return cliente.findAll();
    }

    @GetMapping("/{id}")
    public Mono<AccountTypeController> getById(@PathVariable("id") String id){
        return  cliente.findById(id);
    }

    @PostMapping
    public Mono<AccountTypeController> registrar(@RequestBody AccountTypeController cliente){return cliente.save(cliente);
    }

    @PutMapping
    public Mono<AccountTypeController> modificar(@RequestBody AccountTypeController cliente){return cliente.update(cliente);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") String id){
        return cliente.deleteById(id);
    }
}
