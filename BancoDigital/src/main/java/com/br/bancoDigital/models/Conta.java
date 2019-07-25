package com.br.bancoDigital.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Conta implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "O campo Nº da conta é obrigatório")
	private String nConta;
	
	@DecimalMin(value = "100", message = "depoisite um um valor de R$100 reais ")
	private double saldoCorrente;

	@DecimalMin(value = "100", message = "depoisite um um valor de R$100 reais")
	private double saldoPoupanca;

	@OneToOne(cascade = {CascadeType.ALL})
	@JsonIgnoreProperties("conta")
	private Cliente cliente;

	public Conta() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnConta() {
		return nConta;
	}

	public void setnConta(String nConta) {
		this.nConta = nConta;
	}

	public double getSaldoCorrente() {
		return saldoCorrente;
	}

	public void setSaldoCorrente(double saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
