package com.gihut.manojesus.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicil;
    private final LocalDate dataFinal;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devs = new HashSet<>();

    public Bootcamp(final String nome, final String descricao){
        this.nome = nome;
        this.descricao = descricao;
        dataInicil = LocalDate.now();
        dataFinal = dataInicil.plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicil() {
        return dataInicil;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicil, bootcamp.dataInicil) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicil, dataFinal, conteudos, devs);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataInicilFormatted = dataInicil.format(formatter);
        String dataFinalFormatted = dataFinal.format(formatter);
        return  "Nome do Bootcamp: "+ nome +
                "\nDescricao='" + descricao + '\'' +
                "\nData de inicil do bootcamp: " + dataInicilFormatted +
                "\nData de encerramento do bootcamp: " + dataFinalFormatted +
                "\nConteudos presentes no bootcamp: " + Dev.construirStringFromSet(conteudos) +
                "\nDevs matriculados no bootcamp:" + Dev.construirStringFromSet(devs) ;
    }
}
