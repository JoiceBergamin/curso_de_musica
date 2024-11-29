package com.desenvolvimento.resources;

import com.desenvolvimento.domains.Aluno;
import com.desenvolvimento.domains.Curso;
import com.desenvolvimento.domains.dtos.AlunoDTO;
import com.desenvolvimento.domains.dtos.CursoDTO;
import com.desenvolvimento.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/curso")
public class CursoResource {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public ResponseEntity<List<CursoDTO>> findAll(){
        return ResponseEntity.ok().body(cursoService.findAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<CursoDTO> findById(@PathVariable Long id){
        Curso obj = this.cursoService.findById(id);
        return ResponseEntity.ok().body(new CursoDTO(obj));
}
    @GetMapping(value = "/nomecurso/{nomeCurso}")
    public ResponseEntity<CursoDTO> findById(@PathVariable String nomeCurso){
        Curso obj = this.cursoService.findByNomeCurso(nomeCurso);
        return ResponseEntity.ok().body(new CursoDTO(obj));
    }
}