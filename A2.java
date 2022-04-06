package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARA«√” DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double area, l1, l2;
		
		System.out.println("Digite o valor do lado 1");//ESCREVA
		l1= meuScanner.nextInt();//LEIA
		System.out.println("Digite o valor do lado 2");//ESCREVA
		l2 = meuScanner.nextInt();//LEIA
		area = (l1*l2);
		System.out.println("A ·rea do ret‚ngulo È " + area);

	}

}
