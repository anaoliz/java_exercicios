package listaD;

import java.util.Scanner;

public class D1 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner meuScanner = new Scanner(System.in);
	double v1, v2;
	
	System.out.println("Digite o valor 1");
	v1 = meuScanner.nextInt();
	System.out.println("Digite o valor 2");
	v2 = meuScanner.nextInt();
	
	if(v1>v2) {
		System.out.println("O valor 1 é maior do que o valor 2.");
	}if(v1<v2) {
		System.out.println("O valor 1 é menor do que o valor 2.");
	}if(v1==v2) {
		System.out.println("Os valores são iguais.");

	}
	}
}




