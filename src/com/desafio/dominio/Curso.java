package com.desafio.dominio;

public class Curso extends Conteudo{
   
   private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso: " + getTitulo() + ", Descricao: " + getDescricao() + ", Carga Horaria= " + cargaHoraria + " horas";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    

}
