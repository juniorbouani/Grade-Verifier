package primeiro_passo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class GradeVerifier {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Estudante> lista =  new ArrayList<>(); 
		
		System.out.printf("Digite S para iniciar e N para finalizar: ");
		char n = sc.next().charAt(0);
		sc.nextLine();
		
		
		
		while (n != 'N' && n != 'n') {
			
			System.out.println("Digite o nome do aluno: ");
			String name = sc.nextLine();
			System.out.println("Digite a nota do primeiro bimestre: ");
			double n1 = sc.nextDouble();
			System.out.println("Digite a nota do segundo bimestre: ");
			double n2 = sc.nextDouble();
			System.out.println("Digite a nota do terceiro bimestre: ");
			double n3 = sc.nextDouble();
			sc.nextLine();
			Estudante aluno = new Estudante(name, n1, n2 ,n3);
			aluno.setName(name);
			aluno.notaMedia();
			
			System.out.println("Deseja alterar alguma nota? (s/n)");
			char resposta = sc.next().charAt(0);
			
			if (resposta == 's' ||  resposta == 'S') {
				System.out.println("Qual nota deseja alterar: (1/2/3)");
				int bimestre = sc.nextInt();
				
				switch (bimestre) {
				case 1:
					System.out.println("Digite a nota do primeiro mestre: ");
					double novaNota1 = sc.nextDouble();
					aluno.setNota1(novaNota1);
					break;
				case 2:
					System.out.println("Digite a nota do segundo mestre: ");
					double novaNota2 = sc.nextDouble();
					aluno.setNota2(novaNota2);
					break;
				case 3:
					System.out.println("Digite a nota do terceiro mestre: ");
					double novaNota3 = sc.nextDouble();
					aluno.setNota3(novaNota3);
					break;
				default:
					System.out.println("Bimestre invalido");
					
				}
			}
			
		
			
			lista.add(aluno);
			
			System.out.printf("Digite S para iniciar e N para finalizar: ");
			n = sc.next().charAt(0);
			sc.nextLine();
			
			
		}
		
		System.out.println("----Resumo----");
		for(Estudante x : lista) {
			System.out.println(x);
			System.out.println("----------");
		}

	

	}

}
