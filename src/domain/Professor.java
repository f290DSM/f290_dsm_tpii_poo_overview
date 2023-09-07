package domain;

public class Professor extends Usuario {

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
        String retorno = super.toString();
        return retorno
                .concat("\nMatricula: ")
                .concat(matricula.toString());
    }

}
