package com.desenvolvimento.domains;



import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name="aluno")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aluno")
    private Integer idAluno;

    @NotNull @NotBlank
    private String nomeAluno;

    @NotNull
    @Digits(integer = 11, fraction = 0)
    private Integer cpfAluno;

    @NotNull @NotBlank
    private String emailAluno;

    @NotNull @NotBlank
    @Digits(integer = 7, fraction = 0)
    private String raAluno;

    public Aluno() {
    }

    public Aluno(Integer idAluno, String nomeAluno, Integer cpfAluno, String emailAluno, String raAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
        this.raAluno = raAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public @NotNull @NotBlank String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(@NotNull @NotBlank String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public @NotNull @Digits(integer = 11, fraction = 0) Integer getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(@NotNull @Digits(integer = 11, fraction = 0) Integer cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public @NotNull @NotBlank String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(@NotNull @NotBlank String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public @NotNull @NotBlank @Digits(integer = 7, fraction = 0) String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(@NotNull @NotBlank @Digits(integer = 7, fraction = 0) String raAluno) {
        this.raAluno = raAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(idAluno, aluno.idAluno) && Objects.equals(nomeAluno, aluno.nomeAluno) && Objects.equals(cpfAluno, aluno.cpfAluno) && Objects.equals(emailAluno, aluno.emailAluno) && Objects.equals(raAluno, aluno.raAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, nomeAluno, cpfAluno, emailAluno, raAluno);
    }
}
/* ANOTAÇÕES:
 * Esta classe representa uma das entidades da aplicação*/
