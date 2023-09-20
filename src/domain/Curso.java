package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Curso {
    private String nome;

    //TODO: Criar Getter e Setter
    private List<String> conhecimentos = new ArrayList<>();

    //TODO: Incluir a lista no Construtor padrão
    public Curso(String nome, List<String> conhecimentos) {
        this.nome = nome;
        this.conhecimentos = conhecimentos;
    }
    //TODO: Inicializar a lista de conhecimentos e passá-la como argumento em App

    public String getNome() {
        return nome;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", conhecimentos=" + conhecimentos +
                '}';
    }
}
