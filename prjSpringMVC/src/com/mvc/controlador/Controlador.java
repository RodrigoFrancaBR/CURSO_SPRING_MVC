package com.mvc.controlador;

import com.mvc.modelo.ContaBancaria;

public class Controlador {
	public boolean creditarValor(double valor, int numeroConta, int agencia) {
		if (valor < 0) {
			return false;
		}
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setSaldoAtual(contaBancaria.getSaldoAtual() + valor);
		contaBancaria.setNumeroConta(numeroConta);
		contaBancaria.setAgencia(agencia);
		return true;
	}

	public boolean debitarValor(double valor, int numeroConta, int agencia) {
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNumeroConta(numeroConta);
		contaBancaria.setAgencia(agencia);
		if (valor > contaBancaria.getSaldoAtual()){
			return false;	
		}
		contaBancaria.setSaldoAtual(contaBancaria.getSaldoAtual() - valor);
		return true;
	}
}
