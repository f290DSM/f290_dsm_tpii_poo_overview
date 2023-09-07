package domain;

import java.util.Objects;

/*
 * Uma classe é uma estrutura que define
 * atributos e comportamentos.
 */
public class Usuario {
    // Atributos: nome, telefone, email, github

    /*
     * Java Beans
     * 1. Variaveis e metodos utilizam lowerCamelCase: idUsuario
     * 2. Classes, Interfaces utilizam HighterCamecase: UserId
     * 3. Constantes: snake case com caixa alta: VALOR_DOLAR_ATUAL
     * 4. Prefixos: get, set, add, remove, do
     */
    private String nome;
    private String telefone;
    private String email;
    private String github;

    public Usuario(String nome, String email,
            String telefone, String gitHub) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.github = gitHub;

        System.out.println("Acabei de criar um objeto do tipo " +
                this.getClass().getSimpleName());
    }

    // Comportamentos
    public void exibirDados() {
        System.out.printf("Nome: %s.\n", nome);
        System.out.printf("Telefone: %s.\n", telefone);
        System.out.printf("E-mail: %s.\n", email);
        System.out.printf("GitHub: %s.\n", github);
        System.out.println();
    }

    public void setEmail(String novoEmail) {
        if (!novoEmail.contains("@")) {
            System.out.println("E-mail inválido.");
            email = "";
            return;
        }
        email = novoEmail;
    }

    public String getEmail() {
        if (Objects.isNull(email) || email.isEmpty()) {
            throw new RuntimeException("E-mail não configurado!");
        }
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(nome);
        sb.append("\nE-Mail: ").append(email);
        sb.append("\nTelefone: ").append(telefone);
        sb.append("\nGitHub: ").append(github);
        return sb.toString();
    }
}