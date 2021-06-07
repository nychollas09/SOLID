package br.com.falcao.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.falcao.rh.shared.domain.interfaces.ValidacaoSalarial;
import br.com.falcao.rh.shared.domain.model.Funcionario;

public class ReajusteSalarialService {

	private List<ValidacaoSalarial> validacoesSalariais;

	public ReajusteSalarialService(List<ValidacaoSalarial> validacoesSalariais) {
		this.validacoesSalariais = validacoesSalariais;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) throws Exception {
		for (ValidacaoSalarial validacao : this.validacoesSalariais) {
			validacao.validar(funcionario, aumento);
		}

		funcionario.atualizarSalario(funcionario.getDadosPessoais().getSalario().add(aumento));
	}
}
