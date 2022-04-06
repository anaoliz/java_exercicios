package listaD;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um número");
		num = meuScanner.nextInt();
		
		if (num==0) {
			System.out.println("O número é igual a 0 - zero.");
		}
		if (num==1) {
			System.out.println("O número é igual a 1 - um.");
		}
		if (num==2) {
			System.out.println("O número é igual a 2 - dois.");
		}
		if (num==3) {
			System.out.println("O número é igual a 3 - três.");
		}
		if (num==4) {
			System.out.println("O número é igual a 4 - quatro.");
		}
		if (num==5) {
			System.out.println("O número é igual a 5 - cinco.");
		}
		if (num==6) {
			System.out.println("O número é igual a 6 - seis.");
		}
		if (num==7) {
			System.out.println("O número é igual a 7 - sete.");
		}
		if (num==8) {
			System.out.println("O número é igual a 8 - oito.");
		}
		if (num==9) {
			System.out.println("O número é igual a 9 - nove.");
		}
		if (num==10) {
			System.out.println("O número é igual a 10 - dez.");
		}
		if(num>10) {
			System.out.println("Esse número é inválido.");
		}
		if(num<0) {
			System.out.println("Esse número é inválido.");
		}
	}

}
