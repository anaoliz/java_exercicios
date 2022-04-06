package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double v1;
		
		System.out.println("Digite o valor 1");
		v1 = meuScanner.nextInt();
		if(v1<100) {
			System.out.println("O valor é menor do que 100.");
		}if(v1>100) {
			System.out.println("O valor é maior do que 100.");
		}if(v1==100) {
			System.out.println("Esse valor é igual a 100.");
		}
	}

}
