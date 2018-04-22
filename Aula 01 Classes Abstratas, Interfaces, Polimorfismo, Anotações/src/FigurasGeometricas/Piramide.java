package FigurasGeometricas;

public class Piramide extends Poliedro{

	public Piramide(double base, double altura, double comprimento) {
		super(base, altura, comprimento);
	}

	@Override
	public double volume() {
		return (getBase()* getAltura()) / 3;
	}

	@Override
	public double area() {
		return getAltura() + getBase();
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
