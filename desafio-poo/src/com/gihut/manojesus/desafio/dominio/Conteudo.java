package com.gihut.manojesus.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {

    protected static final double QUANTIDADE_XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double caluclarXPRecebido();

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

    @Override
    public String toString() {
        return "Conteudo: "+ this.getClass().getSimpleName()+
               "\n\t\tNome: "+titulo+
               "\n\t\tDescricao: "+descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(titulo, conteudo.titulo) && Objects.equals(descricao, conteudo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
