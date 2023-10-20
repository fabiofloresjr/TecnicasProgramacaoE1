package negocio;

public class ContaBancaria {

	private String nomeCorrentista;
	private Double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String nomeCorrentista, Double saldo) {
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double quantia) {
		this.saldo += quantia;
	}
	
	public void sacar(Double quantia) throws Exception {
		try {
			verificaSaque(quantia);
			this.saldo -= quantia;
		}catch(Exception e){
			e.getMessage();
		}
	}
	
	public void verificaSaque(Double quantia) throws Exception{
		if (quantia.isNaN()) {
			throw new Exception("A quantia a ser sacada precisa ser um número");
		}
		if (quantia > this.saldo) {
			throw new Exception("A quantia de saque não pode ser maior que o saldo da conta");
		}
	}
}
