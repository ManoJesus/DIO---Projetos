package com.gihut.manojesus.desafio.dominio;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mentoria extends Conteudo{
    private Set<String> palestrantes;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.palestrantes = new HashSet<>();
        this.data = data;
    }


    /*Access methods*/
    public Set<String> getPalestrantes() {
        return palestrantes;
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

        StringBuilder palestrantes = new StringBuilder();
        for(int i = 0; i < this.palestrantes.size(); i++){
            if(i == this.palestrantes.size()-1){
                palestrantes.append(new ArrayList<>(this.palestrantes).get(i)).append(".");
            }else{
                palestrantes.append(new ArrayList<>(this.palestrantes).get(i)).append(",");
            }
        }

        return super.toString() +
                "\n\t\tData da mentoria: "+dateFormatted+
                "\n\t\tPalestrantes presentes: "+palestrantes;
    }

    @Override
    public double caluclarXPRecebido() {
        return QUANTIDADE_XP_PADRAO + 20d;
    }
}
