package model;

public class UsuarioModel {
    private String emailRegistrado = "usuario@example.com";
    private String senhaRegistrada = "senha123";

    public boolean verificarCredenciais(String email, String senha) {
        return emailRegistrado.equals(email) && senhaRegistrada.equals(senha);
    }
}