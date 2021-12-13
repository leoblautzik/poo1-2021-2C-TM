package videoclub.noche;

public abstract class VideGoma implements Entregable{
	
	private String titulo;
	private boolean entregado = false;
	private Genero genero;
	
	public VideGoma(String titulo, Genero genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	protected Genero getGenero() {
		return genero;
	}

	protected void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
}
