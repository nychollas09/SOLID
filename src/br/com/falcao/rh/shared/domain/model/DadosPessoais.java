package br.com.falcao.rh.shared.domain.model;

import java.math.BigDecimal;

public class DadosPessoais {
	private String nome;
	private String cpf;
	private BigDecimal salario;

	public DadosPessoais(String nome, String cpf, BigDecimal salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
