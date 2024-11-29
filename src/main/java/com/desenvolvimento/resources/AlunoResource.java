package com.desenvolvimento.resources;

import com.desenvolvimento.domains.Aluno;
import com.desenvolvimento.domains.dtos.AlunoDTO;
import com.desenvolvimento.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> findAll(){
       return ResponseEntity.ok().body(alunoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AlunoDTO> findById(@PathVariable int id){
        Aluno obj = this.alunoService.findById(id);
        return ResponseEntity.ok().body(new AlunoDTO(obj));
    }
}
