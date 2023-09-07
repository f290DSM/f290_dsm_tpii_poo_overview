package domain;

import java.util.List;

public class Professor extends Usuario implements Avaliavel{

    private Integer matricula;

    public Professor(String nome, String email,
            String telefone, String gitHub, Integer matricula) {

        super(nome, email, telefone, gitHub);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("%s\nMatrícula: %s", super.toString(), matricula);
    }

    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Professor autenticado com suesso!");
    }

    @Override
    public void aplicarAvaliacao(List<Aluno> alunos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarAvaliacao'");
    }
}
