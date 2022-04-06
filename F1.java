package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
        int cod;
		
		System.out.println("Digite o código do departamento");
		cod = meuScanner.nextInt();
		
		if (cod==10) {
			System.out.println("Esse código corresponde ao departamento de Contabilidade.");
		}else {
			System.out.println("Esse funcionário não trabalha no departamento de Contabilidade.");
		}
		
		if (cod==12) {
			System.out.println("Esse código corresponde ao departamento de Almoxarifado.");
		}else {
			System.out.println("Esse funcionário não trabalha no departamento de Almoxarifado.");
		}
		
		if (cod==14) {
			System.out.println("Esse código corresponde ao departamento de Informática.");
		}else {
			System.out.println("Esse funcionário não trabalha no departamento de Informática.");
		}
		
		if (cod!=10 && cod!=12 && cod!=14) {
			System.out.println("Código inválido.");
		}
	}

	}

