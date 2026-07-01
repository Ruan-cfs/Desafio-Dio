package br.com.desafio.dominio;

public abstract class Conteudo {

    protected final double Xp_padrao = 10d;
    protected String nome;
    protected String descicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }
    public abstract double calcularXp();
}
