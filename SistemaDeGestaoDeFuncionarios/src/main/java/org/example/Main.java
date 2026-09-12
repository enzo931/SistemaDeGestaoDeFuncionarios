package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcao = -1;

        do {
            String inputOpcao = JOptionPane.showInputDialog(null,
                    "=== SISTEMA DE FOLHA DE PAGAMENTO ===\n" +
                            "1. Cadastrar/Consultar Gerente\n" +
                            "2. Cadastrar/Consultar Desenvolvedor\n" +
                            "0. Sair\n\n" +
                            "Digite a opção desejada:");

            if (inputOpcao == null) break;

            try {
                opcao = Integer.parseInt(inputOpcao);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    gerenciarGerente();
                    break;
                case 2:
                    gerenciarDesenvolvedor();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private static void gerenciarGerente() {
        String nome = JOptionPane.showInputDialog("Informe o nome do Gerente:");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do Gerente:");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base (R$):"));
        double bonus = Double.parseDouble(JOptionPane.showInputDialog("Informe o bônus de gestão (R$):"));

        Gerente gerente = new Gerente(nome, cpf, salarioBase, bonus);
        int opcaoSubmenu = -1;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "=== PAINEL DO GERENTE ===\n" +
                            "Gerente: " + gerente.getNome() + "\n\n" +
                            "1. Exibir Holerite Completo\n" +
                            "2. Atualizar Bônus de Gestão\n" +
                            "0. Voltar ao Menu Principal\n\n" +
                            "Digite a opção desejada:");

            if (input == null) break;

            try {
                opcaoSubmenu = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }

            switch (opcaoSubmenu) {
                case 1:
                    gerente.exibirHolerite();
                    break;
                case 2:
                    double novoBonus = Double.parseDouble(JOptionPane.showInputDialog("Informe o novo bônus de gestão (R$):"));
                    gerente.setBonusGestao(novoBonus);
                    JOptionPane.showMessageDialog(null, "Bônus atualizado com sucesso!");
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcaoSubmenu != 0);
    }

    private static void gerenciarDesenvolvedor() {
        String nome = JOptionPane.showInputDialog("Informe o nome do Desenvolvedor:");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do Desenvolvedor:");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base (R$):"));
        int horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas extras trabalhadas:"));
        double valorHoraExtra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago por hora extra (R$):"));

        Desenvolvedor dev = new Desenvolvedor(nome, cpf, salarioBase, horasExtras, valorHoraExtra);
        int opcaoSubmenu = -1;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "=== PAINEL DO DESENVOLVEDOR ===\n" +
                            "Dev: " + dev.getNome() + "\n\n" +
                            "1. Exibir Holerite Completo\n" +
                            "2. Registrar novas Horas Extras\n" +
                            "0. Voltar ao Menu Principal\n\n" +
                            "Digite a opção desejada:");

            if (input == null) break;

            try {
                opcaoSubmenu = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }

            switch (opcaoSubmenu) {
                case 1:
                    dev.exibirHolerite();
                    break;
                case 2:
                    int horasAdicionais = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas extras adicionais trabalhadas:"));
                    dev.setHorasExtras(dev.getHorasExtras() + horasAdicionais);
                    JOptionPane.showMessageDialog(null, "Horas extras registradas com sucesso!");
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcaoSubmenu != 0);
    }
}