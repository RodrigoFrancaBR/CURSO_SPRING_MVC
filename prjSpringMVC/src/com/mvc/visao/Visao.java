package com.mvc.visao;

import com.mvc.controlador.Controlador;

public class Visao {

	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		controlador.creditarValor(100.00, 1234,5678 );
		controlador.debitarValor(50.00, 1234, 5678);
		System.out.println();
	}
}
