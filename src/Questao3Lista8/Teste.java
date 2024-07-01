package Questao3Lista8;

public class Teste {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Rodrigozin Alfredo", "123.456.789-10", 3500.00);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Cleusa Messias", "987.654.321-10", 75.00, 40);

        // Impressão das informações dos funcionários
        System.out.println("Informações do Funcionário CLT:");
        System.out.println("Nome: " + funcionarioCLT.getNome());
        System.out.println("CPF: " + funcionarioCLT.getCpf());
        System.out.println("Rendimento mensal: R$" + funcionarioCLT.calcularRendimentos());

        System.out.println();

        System.out.println("Informações do Funcionário Horista:");
        System.out.println("Nome: " + funcionarioHorista.getNome());
        System.out.println("CPF: " + funcionarioHorista.getCpf());
        System.out.println("Rendimento mensal: R$" + funcionarioHorista.calcularRendimentos());
    }
}
