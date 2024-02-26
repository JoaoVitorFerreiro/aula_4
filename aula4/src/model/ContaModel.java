package model;

public abstract class ContaModel {
    protected double saldo;
    protected String email;

    public ContaModel(String email) {
        this.email = email;
        this.saldo = 0.0;
    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            // Lançar uma exceção ou tratar erro de saldo insuficiente
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
}