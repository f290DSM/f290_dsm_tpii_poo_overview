import domain.*;

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
        Aluno a1 = new Aluno(
                "João Pedro",
                "joaopedro@gmail.com",
                "1999999-8888",
                "joaopedrof290", 1000
        );
        Aluno a2 = new Aluno(
                "Enzo Gabriel",
                "enzo@gmail.com",
                "1999999-0000",
                "enzof290", 1000
        );
        professor.setAlunos(Arrays.asList(a1,a2));
        professor.ensina(curso);
        //TODO: Escrever o objeto Curso
        System.out.println(curso);
        //TODO: Exibir os alunos e seus conhecimentos
        professor.getAlunos().forEach(System.out::println);

    }
}
