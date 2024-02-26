package aula4;

import Controller.UsuarioController;
import model.UsuarioModel;
import View.UsuarioView;

public class AppConfig {
    private UsuarioModel usuarioModel;
    private UsuarioView usuarioView;
    private UsuarioController usuarioController;

    public AppConfig() {
        this.usuarioModel = new UsuarioModel();
        this.usuarioView = new UsuarioView();
        this.usuarioController = new UsuarioController(usuarioModel, usuarioView);
    }

    public UsuarioController getUsuarioController() {
        return usuarioController;
    }

}