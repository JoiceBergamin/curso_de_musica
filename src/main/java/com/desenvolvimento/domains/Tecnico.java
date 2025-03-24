package com.desenvolvimento.domains;

import com.desenvolvimento.domains.enums.TipoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa{

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
