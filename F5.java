package listaF;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		double cod, sal_atual, reaj, sal_novo;
		
		System.out.println("Digite o salário atual");
		sal_atual = meuScanner.nextInt();
		System.out.println("Digite o código");
		cod = meuScanner.nextInt();
		
		if (cod==1){
		reaj= (sal_atual/100)*5;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
		if (cod==2){
		reaj= (sal_atual/100)*10;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
		reaj= (sal_atual/100)*15;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
	reaj= (sal_atual/100)*20;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
reaj= (sal_atual/100)*25;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
reaj= (sal_atual/100)*30;
		sal_novo= sal_atual+reaj;
	        System.out.println("O salário antigo era "+sal_atual+", o novo salário é "+sal_novo+" e o reajuste foi de"+reaj);
		}
