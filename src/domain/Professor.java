package domain;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario implements Avaliavel {

    private Integer matricula;
    private List<Aluno> alunos = new ArrayList<>();

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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Professor autenticado com sucesso!");
    }

    @Override
    public void aplicarAvaliacao(List<Aluno> alunos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarAvaliacao'");
    }

    //TODO: Criar um toString() para a classe Aluno
    //TODO: No App: Iterar a lista de alunos exibindo os objetos aluno.
    public void ensina(Curso curso) {
        System.out.println("\nLecionando no curso: " + curso.getNome());
        for (Aluno a : alunos) {
            a.assimilar(curso.getConhecimentos());
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", alunos=" + alunos +
                "} " + super.toString();
    }
}
