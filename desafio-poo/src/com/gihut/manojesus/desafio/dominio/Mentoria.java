package com.gihut.manojesus.desafio.dominio;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Mentoria {
    private String titulo;
    private String descricao;
    private List<String> palestrantes;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, List<String> palestrantes, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.palestrantes = palestrantes;
        this.data = data;
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

    public List<String> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(List<String> palestrantes) {
        this.palestrantes = palestrantes;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormatted = data.format(formatter);
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", palestrantes=" + palestrantes +
                ", data=" + dateFormatted +
                '}';
    }
}
