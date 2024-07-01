package Questao1Lista8;

public class Teste {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("João", "124.457.759-50");
        Funcionario func2 = new Funcionario("Fernando", "989.624.121-30");
        Gerente gerente = new Gerente("Letícia", "392.237.445-70", "TI");

        System.out.println("Funcionário 1:");
        System.out.println(func1);

        System.out.println("Funcionário 2:");
        System.out.println(func2);

        System.out.println("Gerente:");
        System.out.println(gerente);
    }
}

