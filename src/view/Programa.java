package view;

import javax.swing.JOptionPane;

import negocio.ContaService;
import dados.BancoDados;
import entidades.ContaBancaria;
import negocio.ContaServiceImplementacao;
public class Programa {

    public static void main(String[] args) {
    	ContaService contaService = new ContaServiceImplementacao(new BancoDados());

        while (true) {
            String opcao = JOptionPane.showInputDialog(menuPrincipal());
            if (opcao.equals("1")) {
                try {
                    cadastrarConta(contaService);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (opcao.equals("2")) {
                try {
                    depositar(contaService);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (opcao.equals("3")) {
                try {
                    sacar(contaService);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (opcao.equals("4")) {
                System.exit(0);
            }
        }
    }

    public static String menuPrincipal() {
        StringBuilder m = new StringBuilder();
        m.append("Selecione uma opção:\n");
        m.append("1. Cadastrar conta bancária\n");
        m.append("2. Depositar\n");
        m.append("3. Sacar\n");
        m.append("4. Sair\n");
        return m.toString();
    }

    private static void cadastrarConta(ContaService contaService) throws Exception {
        String nome = JOptionPane.showInputDialog("Qual é o nome do correntista?");
        String saldo = JOptionPane.showInputDialog("Qual é o saldo da conta?");
        ContaBancaria contaBancaria = new ContaBancaria(nome, Double.parseDouble(saldo));
        contaService.cadastrarConta(contaBancaria);
        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso.");
    }

    private static void depositar(ContaService contaService) throws Exception {
        String nomeCorrentista = JOptionPane.showInputDialog("Informe o nome do correntista:");
        String quantia = JOptionPane.showInputDialog("Qual é a quantia a ser depositada?");
        contaService.depositar(nomeCorrentista, Double.parseDouble(quantia));
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.");
    }

    private static void sacar(ContaService contaService) throws Exception {
        String nomeCorrentista = JOptionPane.showInputDialog("Informe o nome do correntista:");
        String quantia = JOptionPane.showInputDialog("Qual é a quantia a ser sacada?");
        contaService.sacar(nomeCorrentista, Double.parseDouble(quantia));
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
    }
}