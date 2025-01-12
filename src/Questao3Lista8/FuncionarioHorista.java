package Questao3Lista8;

class FuncionarioHorista extends CFuncionario {
    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double salarioHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRendimentos() {
        return salarioHora * horasTrabalhadas;
    }
}
