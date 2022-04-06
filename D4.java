package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double val1, val2, dife, dife2;
		
		System.out.println("Digite o valor 1");
		val1 = meuScanner.nextInt();
		System.out.println("Digite o valor 2");
		val2 = meuScanner.nextInt();
		if(val1>val2) {
			dife = (val1-val2);
		System.out.println("A diferença é " +dife);
	}if(val2>val1) {
		dife2= (val2-val1);
		System.out.println("A diferença é " +dife2);
	}
	}
}

