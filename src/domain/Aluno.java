package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{
    private Integer ra;
    private List<String> conhecimentos = new ArrayList<>();

    public Aluno(String nome, String email, String telefone, String gitHub, Integer ra) {
        super(nome, email, telefone, gitHub);
        this.ra = ra;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Aluno autenticado com sucesso!");    
    }

    public void assimilar(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", conhecimentos=" + conhecimentos +
                "} " + super.toString();
    }
}
