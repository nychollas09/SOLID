package br.com.falcao.rh.shared.validations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.falcao.rh.shared.domain.interfaces.ValidacaoSalarial;
import br.com.falcao.rh.shared.domain.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajusteSalarial implements ValidacaoSalarial {
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate ultimoReajuste = funcionario.getUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();

		if (ChronoUnit.MONTHS.between(ultimoReajuste, dataAtual) < 6) {
			throw new RuntimeException("Interfalo entre reajustes deve ser no mínimo de 6 meses");
		}
	}
}
