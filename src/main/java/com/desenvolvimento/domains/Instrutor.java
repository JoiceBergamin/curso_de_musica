package com.desenvolvimento.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_instrutor")
    private Integer idInstrutor;

    @NotNull @NotBlank
    private String nomeInstrutor;

    @NotNull
    @Digits(integer = 11, fraction = 0)
    private Integer cpfInstrutor;

    @NotNull @NotBlank
    private String emailInstrutor;

    @NotNull @NotBlank
    private String experienciaInstrutor;

    public Instrutor() {
    }

    public Instrutor(String experienciaInstrutor, String emailInstrutor, Integer cpfInstrutor, String nomeInstrutor, Integer idInstrutor) {
        this.experienciaInstrutor = experienciaInstrutor;
        this.emailInstrutor = emailInstrutor;
        this.cpfInstrutor = cpfInstrutor;
        this.nomeInstrutor = nomeInstrutor;
        this.idInstrutor = idInstrutor;
    }

    public Integer getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(Integer idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public @NotNull @NotBlank String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(@NotNull @NotBlank String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public @NotNull @Digits(integer = 11, fraction = 0) Integer getCpfInstrutor() {
        return cpfInstrutor;
    }

    public void setCpfInstrutor(@NotNull @Digits(integer = 11, fraction = 0) Integer cpfInstrutor) {
        this.cpfInstrutor = cpfInstrutor;
    }

    public @NotNull @NotBlank String getEmailInstrutor() {
        return emailInstrutor;
    }

    public void setEmailInstrutor(@NotNull @NotBlank String emailInstrutor) {
        this.emailInstrutor = emailInstrutor;
    }

    public @NotNull @NotBlank String getExperienciaInstrutor() {
        return experienciaInstrutor;
    }

    public void setExperienciaInstrutor(@NotNull @NotBlank String experienciaInstrutor) {
        this.experienciaInstrutor = experienciaInstrutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor = (Instrutor) o;
        return Objects.equals(idInstrutor, instrutor.idInstrutor) && Objects.equals(nomeInstrutor, instrutor.nomeInstrutor) && Objects.equals(cpfInstrutor, instrutor.cpfInstrutor) && Objects.equals(emailInstrutor, instrutor.emailInstrutor) && Objects.equals(experienciaInstrutor, instrutor.experienciaInstrutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstrutor, nomeInstrutor, cpfInstrutor, emailInstrutor, experienciaInstrutor);
    }
}

/*
 * ANOTAÇÕES:
 * Esta classe representa uma das entidades da aplicação*/
