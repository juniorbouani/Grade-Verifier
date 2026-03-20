package entities;

public class Rectangle {

	
	public double Width;
	public double Height;
	
	public double area() {
		 return Width * Height;
		 }
	public double perimeter() {
		double p = (Width + Height) * 2.0;
		return p;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(Width, 2.0) + Math.pow(Height, 2.0));
	
	}
}

