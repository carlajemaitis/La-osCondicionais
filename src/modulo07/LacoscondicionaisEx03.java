package modulo07;

import java.util.Scanner;

public class LacoscondicionaisEx03 
{
	public static void main(String[] args)
	{
	
	Scanner leia = new Scanner(System.in);
	
	String nome;
	int idade;
	boolean primeiraDoacao = false;
	String resultado;
	int resposta;
	
	System.out.println("Digite o nome do doador: ");
	nome = leia.nextLine();
	
	System.out.println("Digite a idade do doador: " );
	idade = leia.nextInt();
	
	
	System.out.println("É a 1º vez doando sangue?\n"
				 + "Se sim: digite a opção 1.\n"
		    	 + "Se não: digite a opção 2.");
	resposta = leia.nextInt();
		
	if(resposta == 1)
		primeiraDoacao = true;
	else if (resposta == 2)
		primeiraDoacao = false;
	
	if(idade < 18 && idade > 69)
		System.out.println("Que pena, " + nome + ", você não está apto para doar sangue.");
	else if(idade > 60 && idade < 69 && primeiraDoacao == true)
		System.out.println("Que pena, " + nome + ", você não está apto para doar sangue."); 
	else
		System.out.println(nome + ", você está apto para doar sangue, parabéns pela ação!");
	
	leia.close();
	}
}
