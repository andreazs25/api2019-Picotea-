package modelo;

import java.util.ArrayList;

public class Picotea {
	
	private static Picotea instance = null;
	private String decripcion;
	private ArrayList<Establecimiento> bares;
	private ArrayList<Pedido> pedidos;
	private int id = 0;
	
	/**
	 * TODO
	 */
	private Picotea() {
	
	}
	
	/**
	 * TODO
	 * @return
	 */
	public static Picotea getInstance() {
		if (instance == null) {
			instance = new Picotea();
		}
		return instance;
	}

	/**
	 * TODO
	 * @param producto
	 */
	public void anadirCarro(Item producto) {
		
	}
	
	/**
	 * TODO
	 * @param oferta
	 */
	public void anadirCarro(Oferta oferta) {
		
	}
	
	/**
	 * TODO
	 * @return
	 */
	public int generateId() {
		int result=id;
		id++;
		return result;
	}
}
