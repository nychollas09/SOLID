package br.com.falcao.rh.shared.domain.interfaces;

import java.math.BigDecimal;

import br.com.falcao.rh.shared.domain.model.Funcionario;

public interface ValidacaoSalarial {
	public void validar(Funcionario funcionario, BigDecimal aumento) throws Exception;
}
