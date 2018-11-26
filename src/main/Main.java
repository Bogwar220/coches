package main;

import programa.Controlador;
import programa.Modelo;
import vista.Vista;

public class Main {

	public static void main(String[] args) {
		
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista,modelo);		
	}
}
