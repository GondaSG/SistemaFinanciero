package com.bootcamp.sistemabancario.controller;

import com.bootcamp.sistemabancario.domain.TransactionRecord;
import com.bootcamp.sistemabancario.repository.TransactionRecordRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("v1")
public class TransactionRecordController {

    private TransactionRecordRepository transactionRecordRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping(path = "transaction",produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<TransactionRecord> getAll(){
        LOGGER.info("getAll"+ "OK");
        return transactionRecordRepository.findAll();
    }

    @PostMapping(path = "transaction")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody TransactionRecord transactionRecord){
        LOGGER.info("create" + "OK");

        transactionRecordRepository.save(transactionRecord);
    }

    @GetMapping(path = "transaction/{dni}",produces = {"application/json"})
    public ResponseEntity<TransactionRecord> getById(@PathVariable(value = "dni") Long dni){
        LOGGER.info("Hizo la peticion de obtener por Id");
        Optional<TransactionRecord> transactionRecord = transactionRecordRepository.findById(dni);
        if(transactionRecord.isPresent()){
            return new ResponseEntity<>(transactionRecord.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(transactionRecord.get(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping({"transaction/{id}"})
    public void delete(@PathVariable("id") Long id){
        LOGGER.info("Hizo la peticion eliminar por Id");
        transactionRecordRepository.deleteById(id);
    }

    @PutMapping(path = {"transaction/{id}"},produces = "application/json")
    public TransactionRecord update(
            @RequestBody TransactionRecord transactionRecord,
            @PathVariable(value = "id") ObjectId id){
        LOGGER.info("Hizo la peticion por Id");
        transactionRecord.setId(id);
        transactionRecordRepository.save(transactionRecord);
        return transactionRecord;
    }
}
