package com.desenvolvimento.services;

import com.desenvolvimento.domains.dtos.CursoDTO;
import com.desenvolvimento.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoDTO> findAll(){
        return cursoRepository.findAll().stream().map(obj ->
                new CursoDTO(obj)).collect(Collectors.toList());
    }
}
