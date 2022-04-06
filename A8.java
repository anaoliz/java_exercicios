package listaA;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARAÇÃÓ DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double a, b, c;
		
		System.out.println("Digite um número A");//ESCREVA
		a = meuScanner.nextInt();//LEIA
		System.out.println("Digite um número B");//ESCREVA
		b = meuScanner.nextInt();//LEIA
		c = a;
		a = b;
		b = c;
		System.out.println("O valor de A é " +a+ " e o valor de B é " +b);

	}

}
