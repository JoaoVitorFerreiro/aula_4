package model;

public class ContaPoupancaModel extends ContaModel {
    private double rendimento;

    public ContaPoupancaModel(String email, double rendimento) {
        super(email);
        this.rendimento = rendimento;
    }

    // Métodos específicos de poupança podem ser adicionados aqui
}