package com.desenvolvimento.domains;

import java.util.Objects;


public class Instrutor {
    private Integer idInstrutor;
    private String nomeInstrutor;
    private Integer cpfInstrutor;
    private String emailInstrutor;
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

    public String getExperienciaInstrutor() {
        return experienciaInstrutor;
    }

    public void setExperienciaInstrutor(String experienciaInstrutor) {
        this.experienciaInstrutor = experienciaInstrutor;
    }

    public String getEmailInstrutor() {
        return emailInstrutor;
    }

    public void setEmailInstrutor(String emailInstrutor) {
        this.emailInstrutor = emailInstrutor;
    }

    public Integer getCpfInstrutor() {
        return cpfInstrutor;
    }

    public void setCpfInstrutor(Integer cpfInstrutor) {
        this.cpfInstrutor = cpfInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public Integer getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(Integer idInstrutor) {
        this.idInstrutor = idInstrutor;
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
