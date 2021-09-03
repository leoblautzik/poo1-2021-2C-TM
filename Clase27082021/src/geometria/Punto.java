package geometria;

import static java.lang.Math.*;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double consultarX() {
		return x;
		
	}
	
	public double consultarY() {
		return y;
	}
	
	public void cambiarX(double nuevaX) {
		x = nuevaX;
	}
	
	public void cambiarY(double nuevaY) {
		y = nuevaY;
	}
	
	public boolean estaSobreX() {
		return (y == 0);
	}
	
	public boolean estaSobreY() {
		return (x == 0);
		
	}
	
	public boolean esElOrigen() {
		return estaSobreX() && estaSobreY();
		
	}
		
	public static double distancia(Punto a, Punto b) {
	
		return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2)); 
		
	}
	
	public double distancia(Punto otro) {
		return sqrt(pow(this.x - otro.x, 2) + pow(this.y - otro.y, 2));
		
	}
	
}
