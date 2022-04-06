package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um número");
		num = meuScanner.nextInt();
		
		if(num<5) {
			System.out.println("Esse valor é menor do que 5.");
		}if(num>10 ) {
			System.out.println("Esse valor é maior do que 10.");
		}if(num>5 && num<10) {
			System.out.println("Esse número está entre 5 e 10.");
		}
	}
		
	}

