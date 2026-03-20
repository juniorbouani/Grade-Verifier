package entities;

public class Aluno {
		
	public String name;
	public double s1;
	public double s2;
	public double s3;


	public double notaFinal() {
		double media =  s1 + s2 + s3;
		return media;
	}
	
	public double PontosFaltantes() {
		
		 if (notaFinal() < 60.0) {
			 return 60.0 - notaFinal();
			  }
		 
		 else { 
			 return 0.0;
		 }
		
		
		
		
		
	}
		
	
}
