package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARA«√” DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double cel, fah;
		
		System.out.println("Digite a temperatura em ∞C");//ESCREVA
		cel = meuScanner.nextInt();//LEIA
		fah= ((9*cel+160) / 5);
		System.out.println("A temperatura em Fahrenheit È " + fah);
	}

}
