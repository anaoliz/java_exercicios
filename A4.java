package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARA«√” DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double vol, raio, alt;
		
		System.out.println("Digite o valor do raio");//ESCREVA
		raio = meuScanner.nextInt();//LEIA
		System.out.println("Digite o valor da altura");//ESCREVA
		alt = meuScanner.nextInt();//LEIA
		vol = (3.14159*raio*raio*alt);
		System.out.println("O volume da lata È  " + vol);

	}

}
