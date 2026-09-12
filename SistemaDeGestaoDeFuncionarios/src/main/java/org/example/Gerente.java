package org.example;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
    private double bonusGestao;

    public Gerente() {
        super();
        this.bonusGestao = 0;
    }

    public Gerente(String nome, String cpf, double salarioBase, double bonusGestao) {
        super(nome, cpf, salarioBase);
        this.bonusGestao = bonusGestao;
    }

    public double getBonusGestao() {
        return bonusGestao;
    }

    public void setBonusGestao(double bonusGestao) {
        this.bonusGestao = bonusGestao;
    }

    // Sobrescrita do método calcularSalario adicionando o bônus de gestão
    @Override
    public double calcularSalario() {
        return getSalarioBase() + this.bonusGestao;
    }

    @Override
    public void exibirHolerite() {
        String informacoes = "=== HOLERITE DE GERENTE ===\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Salário Base: R$ " + getSalarioBase() + "\n" +
                "Bônus de Gestão: R$ " + this.bonusGestao + "\n" +
                "Salário Líquido Final: R$ " + calcularSalario();
        JOptionPane.showMessageDialog(null, informacoes);
    }
}