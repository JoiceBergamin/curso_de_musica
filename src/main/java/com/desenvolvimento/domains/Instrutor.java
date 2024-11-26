package com.desenvolvimento.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_instrutor")
    private int idInstrutor;

    @NotNull @NotBlank
    private String nomeInstrutor;

    @NotNull @NotBlank
    private String cpfInstrutor;

    @NotNull @NotBlank
    private String emailInstrutor;

    @NotNull @NotBlank
    private String experienciaInstrutor;

    public Instrutor() {
    }

    public Instrutor(int idInstrutor, String nomeInstrutor, String cpfInstrutor, String emailInstrutor, String experienciaInstrutor) {
        this.idInstrutor = idInstrutor;
        this.nomeInstrutor = nomeInstrutor;
        this.cpfInstrutor = cpfInstrutor;
        this.emailInstrutor = emailInstrutor;
        this.experienciaInstrutor = experienciaInstrutor;
    }

    public int getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public @NotNull @NotBlank String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(@NotNull @NotBlank String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public @NotNull @NotBlank String getCpfInstrutor() {
        return cpfInstrutor;
    }

    public void setCpfInstrutor(@NotNull @NotBlank String cpfInstrutor) {
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
        return idInstrutor == instrutor.idInstrutor && Objects.equals(nomeInstrutor, instrutor.nomeInstrutor) && Objects.equals(cpfInstrutor, instrutor.cpfInstrutor) && Objects.equals(emailInstrutor, instrutor.emailInstrutor) && Objects.equals(experienciaInstrutor, instrutor.experienciaInstrutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstrutor, nomeInstrutor, cpfInstrutor, emailInstrutor, experienciaInstrutor);
    }
}

/*
 * ANOTAÇÕES:
 * Esta classe representa uma das entidades da aplicação*/
