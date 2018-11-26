package programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import coche.Coche;

public class Modelo {

	private HashMap<String, Coche> coche;
	private final String NOMBRE_FICHERO = "coches.dat";
	
	public Modelo() {
		
	}
	
	private void guardarDisco() throws FileNotFoundException, IOException {
		ObjectOutputStream serializador = new ObjectOutputStream(
				new FileOutputStream(NOMBRE_FICHERO));
		
		serializador.writeObject(coche);
		serializador.close();
	}
	
	private void cargarDisco() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream deserializador = new ObjectInputStream(
				new FileInputStream(NOMBRE_FICHERO));
		
		coche = (HashMap<String, Coche>) deserializador.readObject();
		deserializador.close();
	}
	
	public void guardar(Coche coche) throws FileNotFoundException, IOException {
		((Map<String, Coche>) coche).put(coche.getMarca(),coche);
		guardarDisco();
	}
}
