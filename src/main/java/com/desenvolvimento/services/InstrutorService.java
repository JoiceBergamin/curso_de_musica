package com.desenvolvimento.services;

import com.desenvolvimento.domains.Instrutor;
import com.desenvolvimento.domains.dtos.InstrutorDTO;
import com.desenvolvimento.repositories.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InstrutorService {

    @Autowired
    private InstrutorRepository instrutorRepository;

    public List<InstrutorDTO> findAll(){
        return instrutorRepository.findAll().stream().map(obj ->
                new InstrutorDTO(obj)).collect(Collectors.toList());
    }
    public Instrutor findById(int id){
        Optional<Instrutor> obj = instrutorRepository.findById(id);
        return obj.orElse(null);

    }
}
