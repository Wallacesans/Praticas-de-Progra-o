package FigurasGeometricas;

public class Trapezio extends Poligono implements Diagonal {

	public Trapezio(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double diagonal() {
		return 0;
	}

	@Override
	public double area() {
		return (getBase() + getBase() * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		return (getBase() + getBase() * getAltura()) / 2;
	}

}
