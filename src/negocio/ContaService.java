package negocio;


public interface ContaService {
    void cadastrarConta(ContaBancaria conta);
    
    void depositar(String nomeCorrentista, double quantia) throws Exception;
    
    void sacar(String nomeCorrentista, double quantia) throws Exception;
}