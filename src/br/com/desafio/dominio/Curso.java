package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return Xp_padrao * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", nome='" + getNome() +
                ", descicao='" + getDescicao() +
                '}';
    }


}
