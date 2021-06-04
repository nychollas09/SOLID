package br.com.falcao.rh.shared.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.falcao.rh.shared.domain.enums.Cargo;

public class Funcionario {
	private DadosPessoais dadosPessoais;
	private Cargo cargo;
	private LocalDate ultimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, Cargo cargo) {
		this.dadosPessoais = dadosPessoais;
		this.cargo = cargo;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.ultimoReajuste = LocalDate.now();
	}

	public boolean isCargo(Cargo cargo) {
		return this.cargo == cargo;
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}

	public DadosPessoais getDadosPessoais() {
		return this.dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getUltimoReajuste() {
		return ultimoReajuste;
	}

	public void setUltimoReajuste(LocalDate ultimoReajuste) {
		this.ultimoReajuste = ultimoReajuste;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + this.dadosPessoais.getNome() + ", cpf=" + this.dadosPessoais.getCpf() + ", cargo="
				+ cargo + ", salario=" + this.dadosPessoais.getSalario() + ", ultimoReajuste=" + this.ultimoReajuste
				+ "]";
	}
}
