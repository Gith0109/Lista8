package Questao2Lista8;

public class Teste {
    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrente = new ContaCorrente("123", "Felipe", 1000);

        System.out.println(contaCorrente.toString());

        contaCorrente.depositarDinheiro(100);
        System.out.println(contaCorrente.toString());

        contaCorrente.sacarDinheiro(1000);
        System.out.println(contaCorrente.toString());

        contaCorrente.depositarDinheiro(115);
        System.out.println(contaCorrente.toString());

        contaCorrente.sacarDinheiro(500);
        System.out.println(contaCorrente.toString());
    }
}