package com.desenvolvimento.services;

import com.desenvolvimento.domains.dtos.AlunoDTO;
import com.desenvolvimento.domains.dtos.CursoDTO;
import com.desenvolvimento.repositories.AlunoRepository;
import com.desenvolvimento.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoDTO> findAll(){
        return alunoRepository.findAll().stream().map(obj ->
                new AlunoDTO(obj)).collect(Collectors.toList());

    }

}