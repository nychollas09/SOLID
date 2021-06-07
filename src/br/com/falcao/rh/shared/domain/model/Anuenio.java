package br.com.falcao.rh.shared.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.falcao.rh.shared.domain.interfaces.Reajuste;

public class Anuenio implements Reajuste {
	private BigDecimal valor;
	private LocalDate data;

	public Anuenio(BigDecimal valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}

	@Override
	public BigDecimal valor() {
		return this.valor;
	}

	@Override
	public LocalDate data() {
		return this.data;
	}
}
