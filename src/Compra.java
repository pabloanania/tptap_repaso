import java.util.List;

public class Compra {
	List<Pasaje> pasajes;
	
	public double calcularPrecio(){
		double aux = 0d;
		
		for (Pasaje p : pasajes)
			aux += p.getCosto();
		
		return aux;
	}
}
