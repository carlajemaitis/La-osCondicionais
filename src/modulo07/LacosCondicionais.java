package modulo07;

import java.util.Scanner;

public class LacosCondicionais
{
	public static void main(String[] args)
	{
	
	Scanner leia = new Scanner(System.in);
	
	int A;
	int	B;
	int	C;
	int	soma = 0;
	
	System.out.printf("Digite um número pra A: ");
	A = leia.nextInt();
	
	System.out.printf("Digite um número pra B: ");
	B = leia.nextInt();
	
	System.out.printf("Digite um número pra C: ");
	C = leia.nextInt();
	
	soma = A + B;
	
	if(soma > C) {
		System.out.println("A soma de A + B é maior que C.");
	} else if (soma < C) {
		System.out.println("A soma de A + B é menor que C.");
	} else {
		System.out.println("A soma de A + B é igual a C.");
	}
	leia.close();
	}

}
