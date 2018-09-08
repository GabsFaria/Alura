package br.com.bytebank.banco.test;

import javax.swing.JOptionPane;

public class TesteArrayDePrimitivos {
	
	public static void main(String[] args) {
		
		int[] idade = new int[5];
		
		for(int i = 0; i<idade.length; i++) {
			idade[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja incrementar"));
			System.out.println(idade[i]);
		}
		
		
		
	}

}
