package Controller;

import model.UsuarioModel;
import View.UsuarioView;

public class UsuarioController {
 private UsuarioModel model;
 private UsuarioView view;

 public UsuarioController(UsuarioModel model, UsuarioView view) {
     this.model = model;
     this.view = view;
 }

 public boolean login(String email, String senha) {
     return model.verificarCredenciais(email, senha);
 }

 public void mostrarMensagemLogin(boolean sucesso) {
     if (sucesso) {
         view.mostrarMensagem("Login realizado com sucesso!");
     } else {
         view.mostrarMensagem("Email ou senha incorretos!");
     }
 }
 }