package coche;

import java.io.Serializable;

public class Coche implements Serializable {
	

	public enum Tipo {
		
		SEDAN,
		CUPE,
		HATCHPACK,
		CABRIOLET,
		ROADSTER,
		BREAK,
		TODOTERRENO,
		CROSSOVER,
		SUV,
		SPORT,
		CAMIONETA	
	}
	
	public enum Combustible {
		
		DIESEL,
		GASOLINA,
		HIBRIDO
	}
	
	public enum Puertas {
		
		TRES,
		CINCO
	}
	
	private String marca;
	private float km;
	private float consumo;	
	private Tipo tipo;
	private Combustible combustible;
	private Puertas puertas;
	private String imagen;
	
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Combustible getCombustible() {
		return combustible;
	}
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}
	public Puertas getPuertas() {
		return puertas;
	}
	public void setPuertas(Puertas puertas) {
		this.puertas = puertas;
	}
	public String toString() {
		return marca;
	}

}
