package com.desenvolvimento.domains;



import java.util.Objects;


public class Aluno {
    private Integer idAluno;
    private String nomeAluno;
    private Integer cpfAluno;
    private String emailAluno;
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

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(Integer cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
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
