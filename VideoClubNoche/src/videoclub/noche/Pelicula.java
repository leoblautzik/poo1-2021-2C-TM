package videoclub.noche;

public class Pelicula extends VideGoma {

	private int anio;
	private String director;
	
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		super(titulo, genero);
		setTitulo(titulo);
		setAnio(anio);
		setGenero(genero);
		setDirector(director);
	}

	public Pelicula(String titulo, String director) {
		this(titulo, 0, Genero.No_Definido, director);
	}

	public Pelicula(String titulo) {
		this(titulo, "");
	}

	public Pelicula() {
		this("");
	}

	

	protected int getAnio() {
		return anio;
	}

	protected void setAnio(int anio) {
		this.anio = anio;
	}

	

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + getTitulo() + ", anio=" + 
				anio + ", entregado=" + isEntregado() + ", genero=" + getGenero()
				+ ", director=" + director + "]";
	}

	@Override
	public int compareTo(Entregable otraPeli) {
		if (otraPeli instanceof Pelicula) {
			Pelicula otra;
			otra = (Pelicula) otraPeli;
			return Integer.compare(this.anio, otra.anio);
		} else
			throw new Error("Casteo inválido");

	}

	

}
