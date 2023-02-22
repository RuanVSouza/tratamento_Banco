package entidades;

import excecoes.excecoesClientes;

public class Cliente {

	private Integer numeroConta;
	private String nome;
	private Double saldo;
	private Double limiteRetirada;
	
	public Cliente() {
	}

	public Cliente(Integer numeroConta, String nome, Double saldo, Double limiteRetirada) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteRetirada = limiteRetirada;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteRetirada() {
		return limiteRetirada;
	}

	public void setLimiteRetirada(Double limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
	
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void retirada(double quantia) {
		validaRetirada(quantia);
		saldo -= quantia;
	}
	
	private void validaRetirada(double quantia) {
		if(quantia > saldo) {
			throw new excecoesClientes("Erro de saque: saldo insuficiente");
		}
		if(quantia > limiteRetirada) {
			throw new excecoesClientes("Erro de saque: Limite de retirada excedido");
		}
	}
	
	
	
	
	
	
}
