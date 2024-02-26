package model;

//Banco.java
import java.util.ArrayList;
import java.util.UUID;

public class BancoModel {
 private String nome;
 private String certificacaoAutorizacao;
 private ArrayList<UsuarioModel> usuarios;

 public BancoModel(String nome) {
     this.nome = nome;
     this.certificacaoAutorizacao = UUID.randomUUID().toString();
     this.usuarios = new ArrayList<>();
 }

 public UsuarioModel criarCliente(String nome, String celular, String email, String senha) {
     UsuarioModel novoUsuario = new UsuarioModel();
     usuarios.add(novoUsuario);
     return novoUsuario;
 }

 public ArrayList<UsuarioModel> listaDeClientes() {
     return usuarios;
 }
}