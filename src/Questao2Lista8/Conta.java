package Questao2Lista8;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo = 0;

    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("—> Deposito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Operação não realizada. Valor de depósito inválido!");
        }
    }

    public void sacarDinheiro(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("——> Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Operação não realizada. Saldo insuficiente na Conta!");
        }
    }

    @Override
    public String toString() {
        return "<< — Estado inicial da Conta — >>\n" +
                "Conta" + numero + " {Titular = " + nomeTitular + ", Saldo = " + String.format("%.2f", saldo) + "}";
    }
}

