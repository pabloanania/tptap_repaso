
public class Pasaje {
	Pasajero pasajero;
	Vuelo vuelo;
	int multiplicadorDistancia;

	public Pasajero getPasajero() {
		return pasajero;
	}
	
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	public double getCosto(){
		return vuelo.getDistanciaVuelo() * multiplicadorDistancia;
	}

	public Pasaje(Pasajero pasajero, Vuelo vuelo, int multiplicadorDistancia){
		this.pasajero = pasajero;
		this.vuelo = vuelo;
		this.multiplicadorDistancia = multiplicadorDistancia;
	}
}
