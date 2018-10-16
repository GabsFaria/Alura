package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new LinkedList<>();
		
		Conta cc = new ContaCorrente(552, 555);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(52, 55);
		lista.add(cc2);
		
		System.out.println("Tamanho: "+lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: "+lista.size());
		
		Conta cc3 = new ContaCorrente(1552, 5);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(25, 69);
		lista.add(cc4);
		
//		for(int i = 0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		System.out.println("--------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
