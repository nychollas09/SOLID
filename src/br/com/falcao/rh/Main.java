package br.com.falcao.rh;

import java.math.BigDecimal;

import br.com.falcao.rh.shared.domain.enums.Cargo;
import br.com.falcao.rh.shared.domain.model.DadosPessoais;
import br.com.falcao.rh.shared.domain.model.Funcionario;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(
				new DadosPessoais("Nichollas Falcão", "08271013335", new BigDecimal(8000)), Cargo.ESPECIALISTA);

		System.out.println(funcionario.toString());
	}
}
