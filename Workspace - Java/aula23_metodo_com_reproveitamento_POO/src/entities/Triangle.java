package entities;

public class Triangle {
	// TODO Auto-generated method stub
	public double a;
	public double b;
	public double c;
	
	// Criação de Função/Método para calcular atributos do triangulo
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
}


////Formula perimetro triangulo x e y
//		double px = (x.a + x.b + x.c) / 2;
//		double py = (y.a + y.b + y.c) / 2;
//		
//		// Área dos triângulos
//		double areax = Math.sqrt((px * (px + x.a)*(px + x.b) + (px + x.c)));
//		double areay = Math.sqrt((py * (py + y.a)*(py + y.b) + (py + y.c)));