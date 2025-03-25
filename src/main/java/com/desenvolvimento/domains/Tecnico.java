package com.desenvolvimento.domains;

import com.desenvolvimento.domains.enums.TipoPessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "tecnico")
public class Tecnico extends Pessoa{

    @JsonIgnore
    @OneToMany(mappedBy = "tecnico") // tecnico é o nome do atributo em OrdemDeMatricula
    private List<OrdemDeMatricula> ordemDeMatriculas = new ArrayList<>();

    public Tecnico(Long id, String nome, String sobrenome, String cpf, String email, String senha) {
        super(id, nome, sobrenome, cpf, email, senha);
        addTipoPessoa(TipoPessoa.TECNICO);
    }

    public Tecnico() {
    super();
        addTipoPessoa(TipoPessoa.TECNICO);
    }

    public List<OrdemDeMatricula> getOrdemDeMatriculas() {
        return ordemDeMatriculas;
    }

    public void setOrdemDeMatriculas(List<OrdemDeMatricula> ordemDeMatriculas) {
        this.ordemDeMatriculas = ordemDeMatriculas;
    }
}
