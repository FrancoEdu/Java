import java.util.Locale;
import java.util.Scanner;

public class forExamplesAndExercicies {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*  ----> EXAMPLES 
			System.out.println("Digite quantos numeros serao somados:");
			int limite = sc.nextInt();
			
			int soma = 0;
			
			for(int cont = 1; cont <= limite; cont++) {
				System.out.println("Digite o " + cont + "o numero");
				int num = sc.nextInt();
				soma = soma + num;
			}
			
			System.out.println("A soma eh: " + soma);
		*/
		
		/* ----> 01
		
			Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
			X, se for o caso.
			
			System.out.println("Digite um numero limite :");
			
			int limite = sc.nextInt();
			
			if(limite > 1000) {
				System.out.println("O limite nao pode ultrapassar 1000 !"
						+ "\n Digite Novamente!");
			}
			else {
				for(int cont = 1; cont <= limite; cont++) {
					if(cont%2 != 0) {
						System.out.println(cont);
					}
				}
				
				System.out.println("Esses sao todos os numeros impares ate o limite");
			}
		*/
		/*
			Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
			Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
			essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
			System.out.println("Digite quantos numeros você digitara: ");
			int qntNum = sc.nextInt();
			
			int in = 0;
			int out = 0;
			
			for (int cont = 1; cont <= qntNum; cont++) {
				System.out.println("Digite o " + cont + " numero");
				int num = sc.nextInt();
				
				if(num <= 20 && num>=10) {
					in++;
				}
				else
					out++;
			}
			
			System.out.println(in + " in\n"
					+ out + " out");
		*/
		/*
		 * 	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
			de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
			conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
			peso 5.
			
			System.out.println("Qauntos testes serao realizados ?");
			int numTestes = sc.nextInt();
			
			for(int cont = 1; cont <= numTestes; cont++) {
				System.out.println(cont + "o teste");
				System.out.println("Digite o valor de a: ");
				double a = sc.nextDouble();
				System.out.println("Digite o valor de b: ");
				double b = sc.nextDouble();
				System.out.println("Digite o valor de c: ");
				double c = sc.nextDouble();
				
				double media = ((a*2)+(b*3)+(c*5)/10);
				
				System.out.println("A media desses valores eh :" + media);
			}
		*/	
		
		
		sc.close();
	}
}
