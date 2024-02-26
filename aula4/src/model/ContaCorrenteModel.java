package model;

public class ContaCorrenteModel extends ContaModel {
    private double taxaOperacao;

    public ContaCorrenteModel(String email, double taxaOperacao) {
        super(email);
        this.taxaOperacao = taxaOperacao;
    }

    // Sobrescrever os métodos de saque e depósito se necessário para aplicar a taxa
}
