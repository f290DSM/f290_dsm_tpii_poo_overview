package domain;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Professor> professores = new ArrayList<>();

    public List<Professor> getProfessores() {
        return professores;
    }

    public void alocarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void desalocarProfessor(Professor professor) {
        professores.remove(professor);
    }

    public void listarProfessores() {
        professores.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "professores=" + professores +
                '}';
    }
}
