import domain.Avaliavel;
import domain.Curso;
import domain.Professor;
import domain.Usuario;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        Professor professor = new Professor(
                "Pedro Villas",
                "pedro@gmail.com",
                "1999999-9999",
                "pedrof290", 1000);

        System.out.println(professor);

        professor.autenticar("user", "password");

        System.out.printf("Professor é Usuario: %b\n", professor instanceof Usuario);
        System.out.printf("Professor é Avaliavel: %b\n", professor instanceof Avaliavel);

        String nomeCurso = "Desenvolvimento de Sistemas Multiplataforma";

        List<String> conhecimentos = Arrays.asList(
                "Programação Web",
                "Programação Mobile",
                "CI/CD",
                "Gestão de Projetos"
        );

        //TODO: Criar toString() da classe Curso.

        Curso curso = new Curso(nomeCurso, conhecimentos);
        professor.ensina(curso);
        //TODO: Escrever o objeto Curso
        System.out.println(professor);

        professor.getAlunos().forEach(System.out::println);

    }
}
