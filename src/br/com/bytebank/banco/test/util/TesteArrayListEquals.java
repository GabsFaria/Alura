package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {

//		Conta cc1= new ContaCorrente(552, 555);
//		Conta cc2 = new ContaCorrente(52, 55);
//
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		ArrayList<Conta> lista = new ArrayList();
		
		Conta cc = new ContaCorrente(552, 555);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(52, 55);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(52,55);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? "+existe);

		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
