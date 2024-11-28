package com.desenvolvimento.resources;

import com.desenvolvimento.domains.dtos.InstrutorDTO;
import com.desenvolvimento.services.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/instrutor")
public class InstrutorResource {

    @Autowired
    private InstrutorService instrutorService;

    @GetMapping
    public ResponseEntity<List<InstrutorDTO>> findAll(){
        return ResponseEntity.ok().body(instrutorService.findAll());

    }
}
