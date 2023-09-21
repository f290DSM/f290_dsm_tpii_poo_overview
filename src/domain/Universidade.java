package domain;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Departamento> departamentos = new ArrayList<>();

    //TODO: Criar Getter

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(Departamento departamento) {
        //TODO: Validar departamento
        departamentos.add(departamento);
    }

    //TODO: Criar metodo para criar e excluir departamentos
    public void excluirDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }
    //TODO: Criar um metodo para listar departamentos
    public void listarDepartamentos() {
        departamentos.forEach(d -> System.out.println(d));
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "departamentos=" + departamentos +
                '}';
    }
}
