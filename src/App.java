import domain.Professor;

public class App {

    public static void main(String[] args) throws Exception {
        Professor usuario1 = new Professor(
                "Pedro Villas",
                "pedro@gmail.com",
                "1999999-9999",
                "pedrof290", 1000);

        System.out.println(usuario1);

        usuario1.autenticar("user", "password");
    }
}
