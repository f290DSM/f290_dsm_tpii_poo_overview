import domain.Contato;

public class App {

    public static void main(String[] args) throws Exception {
        Contato contato1 = new Contato();
        contato1.setNome("Pedro Villas");
        contato1.setTelefone("1999999-9999");
        contato1.setEmail("pedro@gmail.com");
        contato1.setGithub("pedrof290");
        System.out.println(contato1);
    }
}
