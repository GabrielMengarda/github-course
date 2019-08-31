package entrega_2;

import java.util.Scanner;

public class questao_009 {

	public static void main(String[] args) {
		// Pergunte um valor para o usuário e imprima sua tabuada (1 a 10). Repita
		// enquanto o usuário desejar
		
		Scanner tec = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Informe um valor: ");
		num = tec.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"  X "+num+" = "+(num * i));
		}
		
		tec.close();
	}

}
