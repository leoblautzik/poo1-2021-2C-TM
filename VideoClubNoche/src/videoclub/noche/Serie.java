package videoclub.noche;

public class Serie extends VideGoma{

	private int temporadas;
	private String creador;
	
	public Serie(String titulo, int temporadas,  Genero genero, String creador) {
		super(titulo, genero);
		this.temporadas = temporadas;
		this.creador = creador;
		
	}

	@Override
	public int compareTo(Entregable otraSerie) {
		if(otraSerie instanceof Serie) {
			Serie otra = (Serie) otraSerie; 
			return Integer.compare(this.temporadas, otra.temporadas);
		}
		else 
			throw new Error("Casteo inválido");
		
	}

	@Override
	public String toString() {
		return "Serie [temporadas=" + temporadas + ", creador=" + creador + ", getTitulo()=" + getTitulo()
				+ ", getGenero()=" + getGenero() + ", isEntregado()=" + isEntregado() + super.toString() + "]";
	}

	
	
	
}
