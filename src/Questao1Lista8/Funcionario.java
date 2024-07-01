package Questao1Lista8;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 1000.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
        public String toString() {
            return "— Nome: " + nome +
                    "\n— CPF: " + cpf + "\n— Salário: " + salario;
        }
    }