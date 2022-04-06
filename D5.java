package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double v1, v2, v3;
		
		System.out.println("Digite o primeiro valor");
		v1 = meuScanner.nextInt();
		System.out.println("Digite o segundo valor");
		v2 = meuScanner.nextInt();
		System.out.println("Digite o terceiro valor");
		v3 = meuScanner.nextInt();
		
		if(v1<v2 && v2<v3 && v3>v1) {
	   System.out.println("A ordem crescente é " +v1+ " , " +v2+ " e " +v3+ ".");
	}
		if(v1<v2 && v2>v3 && v3>v1) {
		System.out.println("A ordem crescente é " +v1+ " , " +v3+ " e " +v2+ ".");
	}
		if(v1<v2 && v2>v3 && v3<v1) {
			   System.out.println("A ordem crescente é " +v3+ " , " +v1+ " e " +v2+ ".");
	}
		if(v1>v2 && v2<v3 && v3>v1) {
			   System.out.println("A ordem crescente é " +v2+ " , " +v1+ " e " +v3+ ".");
	}
		if(v1>v2 && v2<v3 && v3<v1) {
			   System.out.println("A ordem crescente é " +v2+ " , " +v3+ " e " +v1+ ".");
	}
		if(v1>v2 && v2>v3 && v3<v1) {
			   System.out.println("A ordem crescente é " +v3+ " , " +v2+ " e " +v1+ ".");
	}
	
	}
}
		


