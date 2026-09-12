# 💼 Sistema de Gestão de Funcionários e Folha de Pagamento

Aplicação em **Java** desenvolvida para simular o gerenciamento de colaboradores e o cálculo de folha de pagamento em um ambiente corporativo. O projeto utiliza interface gráfica interativa via `JOptionPane` e aplica conceitos essenciais de Programação Orientada a Objetos (POO).

---

## 📌 Funcionalidades

O sistema permite cadastrar e gerenciar diferentes cargos da empresa com regras de cálculo de salário específicas para cada perfil:

### 👔 Gerente
- **Cálculo de Salário**: Soma o salário base ao bônus de gestão fixado.
- **Atualização de Bônus**: Permite reajustar o valor do bônus de gestão em tempo de execução.
- **Holerite Detalhado**: Exibe nome, CPF, salário base, bônus de gestão e o salário líquido final.

### 💻 Desenvolvedor
- **Cálculo de Salário**: Soma o salário base às horas extras trabalhadas (multiplicadas pelo valor da hora).
- **Registro de Horas Extras**: Permite adicionar novas horas extras acumuladas ao registro atual.
- **Holerite Detalhado**: Exibe nome, CPF, salário base, quantidade/valor das horas extras e o salário líquido final.

---

## 🛠️ Conceitos de POO Aplicados

- **Encapsulamento**: Proteção dos dados dos funcionários (`nome`, `cpf`, `salarioBase`) utilizando atributos privados e acesso controlado via métodos *Getters* e *Setters*.
- **Herança**: A classe `Funcionario` atua como superclasse concentrando os dados e comportamentos comuns, enquanto `Gerente` e `Desenvolvedor` estendem suas funcionalidades.
- **Sobrescrita de Métodos (`@Override`)**: Reimplementação dos métodos `calcularSalario()` e `exibirHolerite()` em cada subclasse para atender às regras de negócio específicas de cada cargo.
- **Polimorfismo e Sobrecarga**: Utilização de construtores sobrecarregados para permitir a instanciação flexível dos objetos.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- JDK (Java Development Kit) 8 ou superior instalado.
- Uma IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal configurado.
