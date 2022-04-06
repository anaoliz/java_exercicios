package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);//DECLARAÇÃÓ DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
		double tp, vm, dis, cons, lu;//DECLARANDO AS VARIÁVEIS PARA RECEBEREM A SOMA E A MEDIA(REAL)
		
		System.out.println("Digite o tempo gasto na viagem em horas");//ESCREVA
		tp = meuScanner.nextInt();//LEIA
		System.out.println("Digite a velocidade média em Km/h");//ESCREVA
		vm = meuScanner.nextInt();//LEIA
		dis = (tp*vm);
		lu = (dis/12);
		System.out.println("A distância percorrida foi " + dis+ "km/h");
		System.out.println("Os litros usados foram " + lu);

	}

}
