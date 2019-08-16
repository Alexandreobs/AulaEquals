package br.digitalhouse.equals;

import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private Double preço;

    public Coca (Integer tamanho, Double preço){
        this.tamanho = tamanho;
        this.preço = preço;

    }

    public Double getPreço() {
        return preço;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho) ||
                Objects.equals(preço, coca.preço);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
