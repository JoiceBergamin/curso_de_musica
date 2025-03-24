package com.desenvolvimento.domains;

import com.desenvolvimento.domains.enums.TipoPessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario extends Pessoa{

    @JsonIgnore
    @OneToMany(mappedBy = "usuario") //usuario é o nome do atributo em OrdemDeMatricula
    private List<OrdemDeMatricula> ordemDeMatriculas = new ArrayList<>();

    public Usuario(Long id, String nome, String sobrenome, String cpf, String email, String senha) {
        super(id, nome, sobrenome, cpf, email, senha);

        addTipoPessoa(TipoPessoa.USUARIO);

    }

    public Usuario() {
        super();
        addTipoPessoa(TipoPessoa.USUARIO);
    }

    public List<OrdemDeMatricula> getOrdemDeMatriculas() {
        return ordemDeMatriculas;
    }

    public void setOrdemDeMatriculas(List<OrdemDeMatricula> ordemDeMatriculas) {
        this.ordemDeMatriculas = ordemDeMatriculas;
    }
}
