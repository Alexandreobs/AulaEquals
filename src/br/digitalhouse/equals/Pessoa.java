package br.digitalhouse.equals;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa (String nome,Integer rg){
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(rg, pessoa.rg);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
