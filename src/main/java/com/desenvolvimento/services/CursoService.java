package com.desenvolvimento.services;

import com.desenvolvimento.domains.Aluno;
import com.desenvolvimento.domains.Curso;
import com.desenvolvimento.domains.dtos.CursoDTO;
import com.desenvolvimento.repositories.CursoRepository;
import com.desenvolvimento.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoDTO> findAll(){
        return cursoRepository.findAll().stream().map(obj ->
                new CursoDTO(obj)).collect(Collectors.toList());
    }
    public Curso findById(Long id){
        Optional<Curso> obj = cursoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Curso não encontrado! Id: " + id));
    }
    public Curso findByNomeCurso(String nomeCurso){
        Optional <Curso> obj = cursoRepository.findByNomeCurso(nomeCurso);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Curso não encontrado! Nome do Curso: " + nomeCurso));
    }
    public Curso create(CursoDTO dto){
        dto.setIdCurso(null);
        Curso obj = new Curso(dto);
        return cursoRepository.save(obj);
    }

}
