package br.com.falcao.rh.shared.validations;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.falcao.rh.shared.domain.interfaces.ValidacaoSalarial;
import br.com.falcao.rh.shared.domain.model.Funcionario;

public class ValidacaoPercentualReajusteSalarial implements ValidacaoSalarial {
	private BigDecimal DEFAULT_MAXIMO_REAJUSTE = new BigDecimal("0.4");

	public void validar(Funcionario funcionario, BigDecimal aumento) throws Exception {
		BigDecimal percentualReajuste = aumento.divide(funcionario.getDadosPessoais().getSalario(),
				RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(this.DEFAULT_MAXIMO_REAJUSTE) > 0) {
			throw new Exception("Reajuste não pode ser superior a 40% do salário");
		}
	}
}
