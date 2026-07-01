package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private int cargaHoraria;
    private LocalDate data;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "nome='" + nome + '\'' +
                ", descicao='" + descicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }
}
