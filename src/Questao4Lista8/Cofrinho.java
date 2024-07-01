package Questao4Lista8;

import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("> Adicionando " + moeda + " no cofrinho...");
        System.out.printf("Total: R$ %.2f\n", calcularTotal());
    }

    public void excluirMoeda(Moeda moeda) {
        if (moedas.contains(moeda)) {
            moedas.remove(moeda);
            System.out.println("> Removendo " + moeda + " no cofrinho...");
        } else {
            System.out.println("> Removendo " + moeda + " no cofrinho...");
            System.out.println("Impossível remover moeda, Valor insuficiente...");
        }
        System.out.printf("Total: R$ %.2f\n", calcularTotal());
    }

    public int getQuantidadeMoeda() {
        return moedas.size();
    }

    public ArrayList<Moeda> getMoedas() {
        return this.moedas;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        if (getQuantidadeMoeda() == 0){
            return "Cofre Vazio!";
        }
        else {
            return "Cofre contém moedas.";
        }
    }
}

