package com.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mentoria extends Conteudo {
   
   private LocalDate data;
   

    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mentoria: " + getTitulo() + ", Descricao: " + getDescricao() + ", Data inicio: " + data.format(formatter)  + " Data final: " + data.plusDays(45).format(formatter) ;
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


   
}
