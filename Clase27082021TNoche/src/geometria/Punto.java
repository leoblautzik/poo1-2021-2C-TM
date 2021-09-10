package geometria;

import static java.lang.Math.*;

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

	public boolean estaSobreX() {
		return this.y == 0;
	}

	public boolean estaSobreY() {
		return this.x == 0;
	}

	public boolean esElOrigen() {
		return estaSobreX() && estaSobreY();

	}

	public double distanciaAlOrigen() {
		return sqrt((pow(this.getX(), 2) + pow(this.getY(), 2)));
	}

	public static double distancia(Punto a, Punto b) {

		return sqrt(pow(b.getX() - a.getX(), 2) + (pow(b.getY() - a.getY(), 2)));

	}

	public double distancia(Punto otro) {

		return sqrt(pow(this.getX() - otro.getX(), 2) + (pow(this.getY() - otro.getY(), 2)));

	}

}
