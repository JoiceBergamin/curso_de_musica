package com.desenvolvimento.domains;

import com.desenvolvimento.domains.enums.Dificuldade;
import com.desenvolvimento.domains.enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Curso {
    private Long idCurso;
    private String nomeCurso;
    private String urlCurso;
    private String descricaoCurso;
    private String cargaHorariaCurso;
    private LocalDate dataInicioCurso;
    private String categoriaCurso;
    private Dificuldade dificuldadeCurso;
    private Status statusCurso;

    public Curso() {
    }

    public Curso(Long idCurso, String nomeCurso, String urlCurso, String descricaoCurso, String cargaHorariaCurso, LocalDate dataInicioCurso, String categoriaCurso, Dificuldade dificuldadeCurso, Status statusCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.urlCurso = urlCurso;
        this.descricaoCurso = descricaoCurso;
        this.cargaHorariaCurso = cargaHorariaCurso;
        this.dataInicioCurso = dataInicioCurso;
        this.categoriaCurso = categoriaCurso;
        this.dificuldadeCurso = dificuldadeCurso;
        this.statusCurso = statusCurso;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getUrlCurso() {
        return urlCurso;
    }

    public void setUrlCurso(String urlCurso) {
        this.urlCurso = urlCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public String getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(String cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public LocalDate getDataInicioCurso() {
        return dataInicioCurso;
    }

    public void setDataInicioCurso(LocalDate dataInicioCurso) {
        this.dataInicioCurso = dataInicioCurso;
    }

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

    public Dificuldade getDificuldadeCurso() {
        return dificuldadeCurso;
    }

    public void setDificuldadeCurso(Dificuldade dificuldadeCurso) {
        this.dificuldadeCurso = dificuldadeCurso;
    }

    public Status getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(Status statusCurso) {
        this.statusCurso = statusCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(idCurso, curso.idCurso) && Objects.equals(nomeCurso, curso.nomeCurso) && Objects.equals(urlCurso, curso.urlCurso) && Objects.equals(descricaoCurso, curso.descricaoCurso) && Objects.equals(cargaHorariaCurso, curso.cargaHorariaCurso) && Objects.equals(dataInicioCurso, curso.dataInicioCurso) && Objects.equals(categoriaCurso, curso.categoriaCurso) && dificuldadeCurso == curso.dificuldadeCurso && statusCurso == curso.statusCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, nomeCurso, urlCurso, descricaoCurso, cargaHorariaCurso, dataInicioCurso, categoriaCurso, dificuldadeCurso, statusCurso);
    }
}
