package org.example;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    // Construtor vazio
    public Funcionario() {
        this.salarioBase = 0;
    }

    // Construtor parametrizado (Sobrecarga)
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método que será sobrescrito pelas subclasses
    public double calcularSalario() {
        return this.salarioBase;
    }

    public void exibirHolerite() {
        String informacoes = "=== HOLERITE DO FUNCIONÁRIO ===\n" +
                "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Salário Base: R$ " + this.salarioBase + "\n" +
                "Salário Liquido Final: R$ " + calcularSalario();
        JOptionPane.showMessageDialog(null, informacoes);
    }
}