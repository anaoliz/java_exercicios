package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARA��� DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double preco, desc, precov;//DECLARANDO AS VARI�VEIS PARA RECEBEREM A SOMA E A MEDIA(REAL)
		
		System.out.println("Digite o pre�o bruto do produto");//ESCREVA
		preco = meuScanner.nextInt();//LEIA
		desc = ((preco/100)*10);//PROCESSAMENTO - SOMA E ATRIBUI��O 
		precov= (preco - desc);
		System.out.println("O valor a vista � igual a " + precov);

	}

}
