package primeiro_passo;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
	
	public static void main (String[] args ) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, y, result;
		
		x = 1;
		y = 1;
		result = 1;
		
		System.out.println("soma = +");
		System.out.println("subtração = -");
		System.out.println("multiplição = *");
		System.out.println("divisão = /");
		System.out.println("porcentagem = %");
		System.out.println("tabuada = t");
		System.out.println("Digite  o operadorador: ");


		char operadores = sc.next().charAt(0);
		
		switch(operadores) {
		
		case '+':
		
				
				System.out.println("Digite os valores: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
				result = x + y;
				System.out.println(result);
				break;
				
				
		case '-':
			
			
				
				System.out.println("Digite os valores: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
				result = x - y;
				System.out.println(result);
				break;
			
		case '*':
			
			
				
				System.out.println("Digite os valores: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
				result = x * y;
				System.out.println(result);
				break;
				
		case '/':
			
				
			System.out.println("Digite os valores: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if ( y == 0  ) {
				
				System.out.println("indefinido");
			
		
			}
			else {
				result = x / y;
				System.out.println(result);
				
	
			}
				
			break;
			
		case '%':
			System.out.println("Digite os valores: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			result = x % y;
			System.out.println(result);
			break;
			
		case 't': 
			
			int n = sc.nextInt();
			
			for (int i = 0; i<=10; i++) {
			
				result = i * n;
				
				
				
				System.out.println(result);
			}
				break;
				}
			}
		}
		// finished