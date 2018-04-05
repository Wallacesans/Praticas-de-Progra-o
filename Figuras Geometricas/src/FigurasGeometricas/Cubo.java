package FigurasGeometricas;

public class Cubo extends Poliedro {

	public Cubo(double base, double altura, double comprimento) {
		super(base, altura, comprimento);
	}

	@Override
	public double volume() {
		return Math.cbrt(getAltura());
	}

	@Override
	public double area() {
		return 6 * getBase();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
