package dados;

import java.util.ArrayList;
import java.util.List;

import entidades.ContaBancaria;

public class BancoDados {
    private List<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria getConta(String nomeCorrentista) {
        for (ContaBancaria conta : contas) {
            if (conta.getNomeCorrentista().equals(nomeCorrentista)) {
                return conta;
            }
        }
        return null;
    }
}