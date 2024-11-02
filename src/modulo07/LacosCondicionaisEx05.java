package modulo07;

import java.util.Scanner;

public class LacosCondicionaisEx05 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int codigo;
		int quantidade;
		float valorTotal;
	
		System.out.println("############## MENU #############");
		System.out.println("1- Cachorro quente..........10,00");
		System.out.println("2- X-Salada.................15,00");
		System.out.println("3- X-Bacon..................18,00");
		System.out.println("4- Bauru....................12,00");
		System.out.println("5- Refrigerante..............8,00");
		System.out.println("6- Suco de laraja...........13,00");
		System.out.println("#################################");
		System.out.println("");
		
		System.out.println(">>>>>>> Digite o numero da refeição desejada: <<<<<<<");
		codigo = leia.nextInt();
		
		System.out.println(">>>>>>> Digite a quantidade desejada: <<<<<<<");
		quantidade = leia.nextInt();
		
		switch (codigo)
		{
			case 1:
				valorTotal = quantidade * 10.00f;
				System.out.println("Você escolheu Cachorro quente, e o total a pagar é = " + valorTotal);
				break;
			case 2:
				valorTotal = quantidade * 15.00f;
				System.out.println("Você escolheu X-Salada, e o total a pagar é = " + valorTotal);
				break;
			case 3:
				valorTotal = quantidade * 18.00f;
				System.out.println("Você escolheu X-Bacon, e o total a pagar é = " + valorTotal);
				break;
			case 4:
				valorTotal = quantidade * 12.00f;
				System.out.println("Você escolheu Bauru, e o total a pagar é = " + valorTotal);
				break;
			case 5:
				valorTotal = quantidade * 8.00f;
				System.out.println("Você escolheu Refrigerante, e o total a pagar é = " + valorTotal);
				break;
			case 6:
				valorTotal = quantidade * 13.00f;
				System.out.println("Você escolheu Suco de laraja, e o total a pagar é = " + valorTotal);
				break;
		}
	}
}
