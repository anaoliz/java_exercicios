package listaD;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		int num1, num2, res;
		
		System.out.println("Digite o primeiro número");
		num1 = meuScanner.nextInt();
	    System.out.println("Digite o segundo número");
	    num2 = meuScanner.nextInt();
	    
	    if(num1>num2) {
	    	res= (num1/num2);
	    	System.out.println("O resultado é igual a "+res+".");
	    }
		if(num2>num1) {
			res= (num2/num1);
			System.out.println("O resultado é igual a "+res+".");
		}
		

	}

}
