package com.desenvolvimento.services;


import com.desenvolvimento.domains.Veiculo;
import com.desenvolvimento.domains.dtos.VeiculoDTO;
import com.desenvolvimento.repositories.VeiculoRepository;
import com.desenvolvimento.services.exceptions.DataIntegrityViolationException;
import com.desenvolvimento.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<VeiculoDTO> findAll(){
//repository ta buscando todos os registros de veiculo, retorna uma lista de objetos Veiculo e convertendo para stream
        return veiculoRepository.findAll().stream().map(obj -> new VeiculoDTO(obj)).collect(Collectors.toList());
    }
    public Veiculo findById(Long id){
        Optional<Veiculo> obj = veiculoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Veiculo não encontrado! Id: " + id));
    }

    public Veiculo findByCpfProprietario(String cpfProprietario){
        Optional<Veiculo> obj = veiculoRepository.findByCpfProprietario(cpfProprietario);
        return obj.orElseThrow(() -> new ObjectNotFoundException("CPF do proprietario não encontrado! cpfProprietario: " + cpfProprietario));
    }
    public void validarVeiculo(VeiculoDTO dto){
        Optional<Veiculo> obj = veiculoRepository.findByCpfProprietario(dto.getCpfProprietario());
        if(obj.isPresent() && obj.get().getId() != dto.getId()){
            throw new DataIntegrityViolationException("Cpf do Proprietario ja cadastrado!");
        }
    }

    public Veiculo create(VeiculoDTO dto){
        dto.setId(null);
        validarVeiculo(dto);
        Veiculo obj = new Veiculo(dto);
        return veiculoRepository.save(obj);
    }

    public Veiculo update(Long id, VeiculoDTO objDto){
        objDto.setId(id);
        Veiculo oldObj = findById(id);
        oldObj = new Veiculo(objDto);
        return veiculoRepository.save(oldObj);
    }
    public void delete(Long id){
        Veiculo obj = findById(id);
        veiculoRepository.deleteById(id);
    }}