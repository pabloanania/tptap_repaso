import java.util.Date;

public class Vuelo {
	private int numero;
	private Date fechaOrigen;
	private Date fechaDestino;
	private Aeropuerto lugarOrigen;
	private Aeropuerto lugarDestino;

	public Vuelo(int numero, Date fechaOrigen, Date fechaDestino, Aeropuerto lugarOrigen, Aeropuerto lugarDestino){
		this.numero = numero;
		this.fechaOrigen = fechaOrigen;
		this.fechaDestino = fechaDestino;
		this.lugarOrigen = lugarOrigen;
		this.lugarDestino = lugarDestino;
	}
	
	public double getDistanciaVuelo(){
		return Math.sqrt(Math.pow(lugarDestino.getLatitud() - lugarOrigen.getLatitud(), 2) + Math.pow(lugarDestino.getLongitud() - lugarOrigen.getLongitud(), 2));
	}
}
