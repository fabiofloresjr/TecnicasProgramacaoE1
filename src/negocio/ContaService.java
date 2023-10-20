package negocio;

public interface ContaService {
	public void sacar(Double quantia) throws Exception;
		
	public void depositar(Double quantia) throws Exception;
		
	public void verificaSaque(Double quantia) throws Exception;
}
