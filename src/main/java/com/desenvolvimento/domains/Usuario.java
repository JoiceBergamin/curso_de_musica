package com.desenvolvimento.domains;

import com.desenvolvimento.domains.enums.TipoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{

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
