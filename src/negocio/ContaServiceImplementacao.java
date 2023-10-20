package negocio;

import dados.BancoDados;

public class ContaServiceImplementacao implements ContaService {

	private BancoDados bancoDadosImplementacao;
	
	public ContaServiceImplementacao(BancoDados bancoDadosImpl) {
	    this.bancoDadosImplementacao = bancoDadosImpl;
	}
	
	public void setBancoDados(BancoDados bancoDadosImpl) {
		    this.bancoDadosImplementacao = bancoDadosImpl;	
	}
	
}
