package entities;

public class Estudante {
	
	private String name;
	private double notaFinal;
	
	private double nota1;
	private double nota2;
	private double nota3;
	
	// aqui ele atribui as variaveis ao private.
	public Estudante(String name, double n1, double n2, double n3) {
		this.name = name;
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		notaMedia();
		}
	
	public String getName() {
		return name;
		}


	public void setName(String name) {
		this.name = name.trim().toUpperCase();
		}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
		notaMedia(); 
		}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
		// aqui caso tenha alguma alteração na nota ele executa o metodo automaticamente para sincronizar a nota.
		notaMedia(); 
		}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
		notaMedia(); 
		}

	public void notaMedia() {
		this.notaFinal =  (this.nota1 + this.nota2 + this.nota3) / 3;
		// o uso do this aqui é para o sistema pegar o valor no coração do cod e não na varivael local
		}
		
	public String tipoStatus() {
		 String status = (this.notaFinal >= 7.0) ? "Aprovado, Parabens!" : "Reprovado, Estudar mais!";
		 return status;
		 }

	public String toString() {
		return "Nome: " 
				+ this.name
				+ "\nNota final: "
				+ String.format("%.2f", this.notaFinal)
				+"\nStatus:  "
				+ tipoStatus();
				}
			}
