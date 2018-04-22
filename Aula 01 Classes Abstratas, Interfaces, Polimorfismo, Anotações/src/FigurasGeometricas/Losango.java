package FigurasGeometricas;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double area() {
		
		return getBase() * getAltura();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getAltura() * 2 + getBase() * 2;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
