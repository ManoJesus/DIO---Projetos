package com.gihut.manojesus.desafio.dominio;

public class Curso {
    private  String titulo;
    private String descricao;
    private String professor;
    private int cargaHoraria;

    public Curso(String titulo, String descricao, String professor, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
    }

    public int calcularXp(){

        return 0;
    }

    /*Access methods*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", professor='" + professor + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
