package listaA;

import java.util.Scanner;

public class exercicio_idade {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner meuScanner = new Scanner(System.in);//DECLARA«√” DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
			int nas, atual, idade, est;
			
			System.out.println("Digite o ano de nascimento");//ESCREVA
			nas= meuScanner.nextInt();//LEIA
			System.out.println("Digite o ano atual");//ESCREVA
			atual = meuScanner.nextInt();//LEIA
			idade = (atual - nas);
			est= (2050 - nas);
			System.out.println("A sua idade È " + idade);
			System.out.println("Em 2050 sua idade ser· " + est);
	
	}

}
