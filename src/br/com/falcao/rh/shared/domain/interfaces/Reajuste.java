package br.com.falcao.rh.shared.domain.interfaces;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

	public BigDecimal valor();

	public LocalDate data();
}
