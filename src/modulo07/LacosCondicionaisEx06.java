package modulo07;

import java.util.Scanner;

public class LacosCondicionaisEx06
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int codigo;
		float salario;
		float reajuste;
		
		System.out.println("1- Gerente................10% ");
		System.out.println("2- Vendedor......... ......7%");
		System.out.println("3- Supervisor..............9%");
		System.out.println("4- Motorista...............6%");
		System.out.println("5- Estoquista..............5%");
		System.out.println("6- Técnico de TI...........8%");
		System.out.println("");
		
		System.out.println("Qual seu nome? ");
		nome = leia.nextLine();
		
		System.out.println("Qual o número correspondente do seu cargo? ");
		codigo = leia.nextInt();
		
		System.out.println("Qual o seu salário? ");
		salario = leia.nextFloat();
		
		switch (codigo)
		{
			case 1:
				reajuste = salario + (salario * 0.10f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
			case 2:
				reajuste = salario + (salario * 0.07f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
			case 3:
				reajuste = salario + (salario * 0.090f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
			case 4:
				reajuste = salario + (salario * 0.06f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
			case 5:
				reajuste = salario + (salario * 0.05f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
			case 6:
				reajuste = salario + (salario * 0.08f);
				System.out.println("O seu novo reajuste é de: " + reajuste);
				break;
		}
	}
}
