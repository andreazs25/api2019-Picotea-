package modelo;

import java.util.ArrayList;

public class Oferta extends Categoria {
	
	private Float precio;

	/**
	 * TODO
	 * @param nombre
	 * @param productos
	 * @param precio
	 */
	public Oferta(String nombre, ArrayList<Item> productos, Float precio) {
		super(nombre, productos);
		this.precio = precio;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public String mostrarOferta() {
		return "{precio:"+precio+","+ super.mostrarCategoria() + "}";
	}

}
