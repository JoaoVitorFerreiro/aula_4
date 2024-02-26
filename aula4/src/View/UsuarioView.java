package View;

import javax.swing.JOptionPane;

public class UsuarioView extends Mensagens {
	public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
