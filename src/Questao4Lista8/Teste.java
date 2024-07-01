package Questao4Lista8;

// Classe Teste
public class Teste {
    public static void main(String[] args) {


        Moeda umCentavo = new Moeda(0.01,"centavos");
        Moeda cincoCentavos = new Moeda(0.05,"centavos");
        Moeda dezCentavos = new Moeda(0.10,"Centavos");
        Moeda vinteECincoCentavos = new Moeda(0.25,"Centavos");
        Moeda cinquentaCentavos = new Moeda(0.50,"Centavos");
        Moeda umReal = new Moeda(1.00,"Centavos");


        Cofrinho cofrinho = new Cofrinho();

        System.out.println("—-> Estado do cofre...");
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(umCentavo);
        cofrinho.adicionarMoeda(cincoCentavos);
        cofrinho.adicionarMoeda(dezCentavos);
        cofrinho.adicionarMoeda(vinteECincoCentavos);

        cofrinho.excluirMoeda(dezCentavos);

        cofrinho.adicionarMoeda(cinquentaCentavos);
        cofrinho.adicionarMoeda(umReal);

        System.out.println(cofrinho);
    }
}

