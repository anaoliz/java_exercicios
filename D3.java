package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		int cod;
		
		System.out.println("Digite o c�digo do departamento");
		cod = meuScanner.nextInt();
		
		if (cod==1) {
			System.out.println("Esse c�digo corresponde ao departamento de Expedi��o.");
		}
		if (cod==2) {
			System.out.println("Esse c�digo corresponde ao departamento de Recursos Humanos.");
		}
		if (cod==3) {
			System.out.println("Esse c�digo corresponde ao departamento de Log�stica.");
		}
		if (cod==4) {
			System.out.println("Esse c�digo corresponde ao departamento de Contabilidade.");
		}
		if (cod>4 || cod<1) {
			System.out.println("C�digo inv�lido.");
		}
	}
	}

