package com.desenvolvimento.resources;

import com.desenvolvimento.domains.Aluno;
import com.desenvolvimento.domains.Instrutor;
import com.desenvolvimento.domains.dtos.AlunoDTO;
import com.desenvolvimento.domains.dtos.InstrutorDTO;
import com.desenvolvimento.services.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping(value = "/{id}")
    public ResponseEntity<InstrutorDTO> findById(@PathVariable int id){
        Instrutor obj = this.instrutorService.findById(id);
        return ResponseEntity.ok().body(new InstrutorDTO(obj));
}
    @GetMapping(value = "/cpfInstrutor/{cpfInstrutor}")
    public ResponseEntity<InstrutorDTO> findById(@PathVariable String cpfInstrutor){
        Instrutor obj = this.instrutorService.findByCpfInstrutor(cpfInstrutor);
        return ResponseEntity.ok().body(new InstrutorDTO(obj));
    }

}
