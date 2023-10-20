package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.ContaBancaria;

public class BancoDados {

	private List<ContaBancaria> lista = new ArrayList<ContaBancaria>();
	
	public void salvar(ContaBancaria contaBancaria) {
		lista.add(contaBancaria);

	}
}
