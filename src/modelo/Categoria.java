package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Categoria {
	
	private String nombre;
	private ArrayList<Item> productos;
	
	/**
	 * TODO
	 * @param nombre
	 * @param productos
	 */
	public Categoria(String nombre,ArrayList<Item> productos ) {
		this.nombre=nombre;
		this.productos=productos;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public String mostrarCategoria() {
		String result = "{nombre:" + nombre +", items: [";
		for(Item i:productos) {
			String item = i.mostrarItem();
			result += item;
			result += ",";
		}
		// eliminar ultima coma TODO
		result += "]}";
		return result;
	}
	
	/**
	 * TODO
	 * @param nombre
	 * @return
	 */
	public Item anadirCarrito(String nombre) {
		Boolean enc=false;
		Iterator<Item> it = productos.iterator();
		Item result= null;
		while(it.hasNext() && !enc) {
			Item next = it.next();
			if(next.is(nombre)) {
				enc=true;
				result=next;
			}
		}
		return result;	
	}


	/**
	 * TODO
	 * @param nombre
	 * @return
	 */
	public Boolean is (String nombre) {
		return this.nombre.equals(nombre);
	}
}
