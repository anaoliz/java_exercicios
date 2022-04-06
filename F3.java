package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double n1,n2,n3,n4,res;
		
		System.out.println("Digite a primeira nota");
		n1 = meuScanner.nextInt();
		System.out.println("Digite a segunda nota");
		n2 = meuScanner.nextInt();
		System.out.println("Digite a terceira nota");
		n3 = meuScanner.nextInt();
		System.out.println("Digite a quarta nota");
		n4 = meuScanner.nextInt();
		
		res= (n1+n2+n3+n4)/4;
		
		if (5<=res)
			System.out.println("Aprovado, sua média é"+res);
	} else {
		System.out.println("Reprovado, sua média é"+res);
	}

}
