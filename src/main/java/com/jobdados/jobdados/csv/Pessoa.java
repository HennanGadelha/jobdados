package com.jobdados.jobdados.csv;

public class Pessoa {

    String nome;
    Double idade;

    public Pessoa(String nome, Double idade, String apelido) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
