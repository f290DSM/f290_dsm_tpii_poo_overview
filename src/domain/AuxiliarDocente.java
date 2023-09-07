package domain;

import java.util.List;

public class AuxiliarDocente extends Usuario{

    public AuxiliarDocente(String nome, String email, String telefone, String gitHub) {
        super(nome, email, telefone, gitHub);
    }

    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Auxiliar autrnticado...");
    }
    
}
