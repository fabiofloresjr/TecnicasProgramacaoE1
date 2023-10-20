package negocio;

import dados.BancoDados;

public class ContaServiceImplementacao implements ContaService {
    private BancoDados bancoDados;

    public ContaServiceImplementacao(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    @Override
    public void cadastrarConta(ContaBancaria conta) {
        bancoDados.adicionarConta(conta);
    }

    @Override
    public void depositar(String nomeCorrentista, double quantia) throws Exception {
        ContaBancaria conta = bancoDados.getConta(nomeCorrentista);
        if (quantia <= 0) {
            throw new Exception("A quantia a ser depositada precisa ser maior que zero");
        }
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual + quantia);
    }

    @Override
    public void sacar(String nomeCorrentista, double quantia) throws Exception {
        ContaBancaria conta = bancoDados.getConta(nomeCorrentista);
        if (quantia <= 0) {
            throw new Exception("A quantia a ser sacada precisa ser maior que zero");
        }
        if (quantia > conta.getSaldo()) {
            throw new Exception("A quantia de saque não pode ser maior que o saldo da conta");
        }
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual - quantia);
    }
}
