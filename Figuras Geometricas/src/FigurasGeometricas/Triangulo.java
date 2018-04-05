package FigurasGeometricas;

public class Triangulo extends Poligono{

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		
		return (getBase() * getAltura())/ 2 ;
	}

	@Override
	public double perimetro() {
		double l = Math.pow(getAltura(),2)+ Math.pow(getBase(), 2); 
		double lado = Math.sqrt(l);
		return getAltura() + getBase() + lado;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
