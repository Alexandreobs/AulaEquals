package br.digitalhouse.equals;

import java.util.List;
import java.util.Objects;

public class Aluno {
    private String Nome;
    private Integer numoeroDoAluno;

    public Aluno(String nome, Integer numoeroDoAluno){
        this.Nome = Nome;
        this.numoeroDoAluno = numoeroDoAluno;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getNumoeroDoAluno() {
        return numoeroDoAluno;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setNumoeroDoAluno(Integer numoeroDoAluno) {
        this.numoeroDoAluno = numoeroDoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numoeroDoAluno, aluno.numoeroDoAluno);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
