package com.gihut.manojesus.desafio.dominio;

public class Curso extends Conteudo{
    private String professor;
    private int cargaHoraria;

    public Curso(String titulo, String descricao, String professor, int cargaHoraria) {
        super(titulo, descricao);
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
    }

    public int calcularXp(){

        return 0;
    }

    /*Access methods*/

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
        return super.toString() +
                "\n\t\tProfessor: "+professor+
                "\n\t\tCarga Horaria do curso: "+cargaHoraria + " hrs";
    }

    @Override
    public double caluclarXPRecebido() {
        return QUANTIDADE_XP_PADRAO * cargaHoraria;
    }
}
