package com.desenvolvimento.domains;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="aluno")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aluno")
    private int idAluno;

    @NotNull
    @NotBlank
    private String nomeAluno;

    @NotNull
    @NotBlank
    private String cpfAluno;

    @NotNull
    @NotBlank
    private String emailAluno;

    @NotNull
    private int raAluno;

    public Aluno() {
    }

    public Aluno(int idAluno, String nomeAluno, String cpfAluno, String emailAluno, int raAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
        this.raAluno = raAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public @NotNull @NotBlank String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(@NotNull @NotBlank String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public @NotNull @NotBlank String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(@NotNull @NotBlank String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public @NotNull @NotBlank String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(@NotNull @NotBlank String emailAluno) {
        this.emailAluno = emailAluno;
    }

    @NotNull
    public int getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(@NotNull int raAluno) {
        this.raAluno = raAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idAluno == aluno.idAluno && raAluno == aluno.raAluno && Objects.equals(nomeAluno, aluno.nomeAluno) && Objects.equals(cpfAluno, aluno.cpfAluno) && Objects.equals(emailAluno, aluno.emailAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, nomeAluno, cpfAluno, emailAluno, raAluno);
    }
}

/* ANOTAÇÕES:
 * Esta classe representa uma das entidades da aplicação*/
