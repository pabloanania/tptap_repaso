
public class Modelo {
	private int capacidad;
	private int salidas;
	private String[] categorias;		// Esto cambiar por algun pattern
	private String[] disposicion;		// IDEM (ej. 4-5-4)
	
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getSalidas() {
		return salidas;
	}
	public void setSalidas(int salidas) {
		this.salidas = salidas;
	}
	public String[] getCategorias() {
		return categorias;
	}
	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}
	public String[] getDisposicion() {
		return disposicion;
	}
	public void setDisposicion(String[] disposicion) {
		this.disposicion = disposicion;
	}
}
