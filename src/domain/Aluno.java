package domain;

public class Aluno extends Usuario{
    private Integer ra;

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

    @Override
    public String toString() {
        return String.format("%s\nRA: %s", super.toString(), ra);
    }

    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Aluno autenticado com sucesso!");    
    }
}
