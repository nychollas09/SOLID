package br.com.falcao.rh.shared.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.falcao.rh.shared.domain.interfaces.ReajusteTributavel;

public class Promocao implements ReajusteTributavel {
	private BigDecimal valor;
	private LocalDate data;

	public Promocao(BigDecimal valor, LocalDate data) {
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

	@Override
	public BigDecimal valorImpostoDeRenda() {
		return this.valor.multiply(new BigDecimal("0.1"));
	}
}
