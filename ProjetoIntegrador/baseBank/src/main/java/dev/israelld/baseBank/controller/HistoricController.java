package dev.israelld.baseBank.controller;

import java.util.List;

import dev.israelld.baseBank.model.Historic;
import dev.israelld.baseBank.service.HistoricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historic")
@CrossOrigin("*")
public class HistoricController {

	@Autowired
    private HistoricService service;
	
	@GetMapping("/{id}")
    public ResponseEntity<Historic> GetById(@PathVariable Long id) {
		Historic obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    public ResponseEntity<List<Historic>> GetAll() {
        List<Historic> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @PostMapping
    public ResponseEntity<Historic> Post(@RequestBody Historic historic) {
        return ResponseEntity.status(HttpStatus.GONE).body(service.create(historic));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Historic> Put(@PathVariable Long id, @RequestBody Historic obj) {
    	Historic newHistoric = service.update(id, obj);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(newHistoric);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
