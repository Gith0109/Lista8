package Questao2Lista8;

public class ContaCorrente extends Conta {
    private double limite = 500;

    public ContaCorrente(String numero, String nomeTitular, double saldo) {
        super(numero, nomeTitular, saldo);
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public void sacarDinheiro(double valor) {
        double saldoTotal = getSaldo() + limite;
        if (valor > 0 && valor <= saldoTotal) {
            if (valor <= getSaldo()) {
                super.sacarDinheiro(valor);
            } else {
                double limiteUsado = valor - getSaldo();
                setSaldo(0);
                limite -= limiteUsado;
                System.out.println("——> Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
            }
        } else {
            System.out.println("Operação não realizada. Valor de saque de R$ " + String.format("%.2f", valor) + " excede o limite disponível na Conta Corrente!");
        }
    }

    @Override
    public String toString() {
        return "<< — Estado inicial da Conta Corrente — >>\n" +
                "Conta" + getNumero() + " {Titular = " + getNomeTitular() + ", Saldo = " + String.format("%.2f", getSaldo()) + " (Limite " + String.format("%.2f", limite) + ")}";
    }
}