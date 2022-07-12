package com.bootcamp.sistemabancario.controller;
import com.bootcamp.sistemabancario.domain.AccountType;
import com.bootcamp.sistemabancario.domain.request.AccountTypeRequest;
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
import com.bootcamp.sistemabancario.service.IAccountTypeService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class AccountTypeController {

    @Autowired
    private IAccountTypeService iAccountTypeService;

    @GetMapping
    public Flux<AccountType> findAll(){
        return iAccountTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<AccountType> getById(@PathVariable("id") ObjectId id){
        return  iAccountTypeService.findById(id);
    }

    @PostMapping
    public Mono<AccountType> register(@RequestBody AccountType accountType){return iAccountTypeService.save(accountType);
    }

    @PutMapping
    public Mono<AccountType> update(@RequestBody AccountType accountType){return iAccountTypeService.update(accountType);
    }

    @DeleteMapping
    public Mono<Void> delete(@PathVariable("id") ObjectId id){
        return iAccountTypeService.deleteById(id);
    }
}
