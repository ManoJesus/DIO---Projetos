package com.gihut.manojesus.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteduosConcluidos;
    private double quantidadeXp;

    public Dev(String nome) {
        this.nome = nome;
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteduosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudoConcluido = this.conteudosInscritos.stream().findFirst();
        if(conteudoConcluido.isPresent()){
            this.conteduosConcluidos.add(conteudoConcluido.get());
            this.conteudosInscritos.remove(conteudoConcluido.get());
        }
    }

    public void calcularTotalXP(){
        this.quantidadeXp =  this.conteduosConcluidos.stream().mapToDouble(Conteudo::caluclarXPRecebido).sum();
    }

    /*Access methods*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }



    public Set<Conteudo> getConteduosConcluidos() {
        return conteduosConcluidos;
    }

    public double getQuantidadeXp() {
        return quantidadeXp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteduosConcluidos, dev.conteduosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteduosConcluidos);
    }
    //TODO: Procurar um melhor modo de implementar esse metodo
    public static StringBuilder construirStringFromSet(Set setASerConvertido){
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < setASerConvertido.size(); i++){
            if(i != setASerConvertido.size()-1) {
                result.append('\n').append("\t\t").append(new ArrayList<>(setASerConvertido).get(i).toString()).append("\n");
            }else {
                result.append('\n').append("\t\t").append(new ArrayList<>(setASerConvertido).get(i).toString());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return  "\nNome do Dev: " + nome +
                "\nConteudosInscritos:" + construirStringFromSet(conteudosInscritos) +
                "\nConteduosConcluidos:" + construirStringFromSet(conteduosConcluidos) +
                "\nXp: "+ quantidadeXp +
                '\n';
    }
}
