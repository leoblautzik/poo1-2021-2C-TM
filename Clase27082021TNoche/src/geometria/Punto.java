package geometria;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	boolean estaSobreX() {
		return this.y == 0;
	}

	boolean estaSobreY() {
		return this.x == 0;
	}

	boolean esElOrigen() {
		return estaSobreX() && estaSobreY();

	}

}