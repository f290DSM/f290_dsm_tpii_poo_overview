import domain.Avaliavel;
import domain.Professor;
import domain.Usuario;

public class App {

    public static void main(String[] args) throws Exception {
        Professor usuario1 = new Professor(
                "Pedro Villas",
                "pedro@gmail.com",
                "1999999-9999",
                "pedrof290", 1000);

        System.out.println(usuario1);

        usuario1.autenticar("user", "password");

        System.out.printf("Professor é Usuario: %b\n", usuario1 instanceof Usuario);
        System.out.printf("Professor é Avaliavel: %b", usuario1 instanceof Avaliavel);
    }
}
