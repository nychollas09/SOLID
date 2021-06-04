package br.com.falcao.rh.service;

import br.com.falcao.rh.shared.domain.enums.Cargo;
import br.com.falcao.rh.shared.domain.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) throws Exception {
		if (funcionario.isCargo(Cargo.GERENTE)) {
			throw new Exception("Gerentes não podem ser promovidos");
		}

		if (!metaBatida) {
			throw new Exception("Funcionário não bateu a meta");
		}

		funcionario.promover(funcionario.getCargo().getProximoCargo());
	}

}
