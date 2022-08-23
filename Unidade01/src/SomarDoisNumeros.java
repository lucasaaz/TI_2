import java.util.Scanner;

public class SomarDoisNumeros {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		//variaveis
		float soma;
		double delta;
		double raiz1;
		double raiz2;
		int a;
		int b;
		int c;
		
		//coletar dados
		System.out.print("Digite o primeiro numero a: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo numero b: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro numero c: ");
		c = sc.nextInt();
		
		//calular
		soma = (b*b)- (4*a*c); 
		delta = (double) Math.sqrt(soma);
		raiz1 = (-b + delta)/ 2*a;
		raiz2 = (-b - delta)/ 2*a;
		
		System.out.println("Soma: " + soma);
		System.out.println("Delta: " + delta);
		//resultado
		System.out.println("Resultado da 1°raiz: " + raiz1 + "\n" + "Resultado da 2°raiz: " + raiz2);
		
		
	}
	
}
