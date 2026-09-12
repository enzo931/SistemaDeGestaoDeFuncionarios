package org.example;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public Desenvolvedor() {
        super();
        this.horasExtras = 0;
        this.valorHoraExtra = 0;
    }

    public Desenvolvedor(String nome, String cpf, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, cpf, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    // Sobrescrita do método calcularSalario somando o valor total das horas extras
    @Override
    public double calcularSalario() {
        double totalHorasExtras = this.horasExtras * this.valorHoraExtra;
        return getSalarioBase() + totalHorasExtras;
    }

    @Override
    public void exibirHolerite() {
        double totalHoras = this.horasExtras * this.valorHoraExtra;
        String informacoes = "=== HOLERITE DE DESENVOLVEDOR ===\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Salário Base: R$ " + getSalarioBase() + "\n" +
                "Horas Extras: " + this.horasExtras + "h (R$ " + totalHoras + ")\n" +
                "Salário Líquido Final: R$ " + calcularSalario();
        JOptionPane.showMessageDialog(null, informacoes);
    }
}