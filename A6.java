package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARAÇÃÓ DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double ht, vh, pd, sb, td, sl;
		
		System.out.println("Digite as horas trabalhadas no mês");//ESCREVA
		ht = meuScanner.nextInt();//LEIA
		System.out.println("Digite o valor da hora trabalhada");//ESCREVA
		vh = meuScanner.nextInt();//LEIA
		System.out.println("Digite o percentual de desconto");//ESCREVA
		pd = meuScanner.nextInt();//LEIA
		sb= (ht*vh);
		td = ((pd/100)*sb);
		sl = (sb - td);
		System.out.println("O salário líquido é " + sl);

	}

}
