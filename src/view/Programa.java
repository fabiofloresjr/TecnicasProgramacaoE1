package view;

import javax.swing.JOptionPane;

import negocio.ContaBancaria;

public class Programa {

	public static void main(String[] args) {
		while (true) {
		    String opcao = JOptionPane.showInputDialog(menuPrincipal());
		    if (opcao.equals("1")) {
			try {
			    cadastrarConta();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		    } else if (opcao.equals("2")) {
			try {
			    depositar();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		    } else if (opcao.equals("3")) {
			try {
				sacar();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			}
			else if (opcao.equals("4")) {
			System.exit(1);
		    }
		}
	}
	public static String menuPrincipal() {
		StringBuilder m = new StringBuilder();
		m.append("selecione uma opcao\n");
		m.append("1. cadastrar conta bancária");
		m.append("2. depositar");
		m.append("3. sacar");
		m.append("4. sair\n");
		return m.toString();
	}
	private static void cadastrarConta() throws Exception {
		String nome = JOptionPane.showInputDialog("Qual nome do correntista?");
		String saldo = JOptionPane.showInputDialog("Qual o saldo da conta?");
		ContaBancaria contaBancaria = new ContaBancaria(nome, Double.parseDouble(saldo));
		
	}
	
	private static void depositar() throws Exception {
		String quantia = JOptionPane.showInputDialog("Qual a quantia a ser depositada?");
	}
	
	private static void sacar() throws Exception {
		String quantia = JOptionPane.showInputDialog("Qual a quantia a ser sacada?");
	}

}
