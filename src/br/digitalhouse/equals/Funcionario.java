package br.digitalhouse.equals;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private Integer numeroDoFuncionario;

    Funcionario(String nome, Integer numeroDoFuncionario){
        this.nome = nome;
        this.numeroDoFuncionario = numeroDoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroDoFuncionario() {
        return numeroDoFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDoFuncionario(Integer numeroDoFuncionario) {
        this.numeroDoFuncionario = numeroDoFuncionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(numeroDoFuncionario, that.numeroDoFuncionario);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
