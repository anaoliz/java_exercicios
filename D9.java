package listaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		int cod, atual, novo, reaj;
		
		System.out.println("Digite o sal�rio atual do funcion�rio");
		atual = meuScanner.nextInt();
		System.out.println("Digite o c�digo do funcion�rio");
		cod = meuScanner.nextInt();
		
		if(cod==1) {
			reaj= (5*atual)/100;
			novo= atual+reaj;
			System.out.println("O sal�rio antigo era "+atual+", o novo sal�rio � "+novo+", sendo um reajuste de "+reaj+" para o cargo de operador.");
		}
		if(cod==2) {
			reaj= (10*atual)/100;
			novo= atual+reaj;
			System.out.println("O sal�rio antigo era "+atual+", o novo sal�rio � "+novo+", sendo um reajuste de "+reaj+" para o cargo de programador.");
		}
		if(cod==3) {
			reaj= (15*atual)/100;
			novo= atual+reaj;
			System.out.println("O sal�rio antigo era "+atual+", o novo sal�rio � "+novo+", sendo um reajuste de "+reaj+" para o cargo de analista.");
		}
	}

	}
