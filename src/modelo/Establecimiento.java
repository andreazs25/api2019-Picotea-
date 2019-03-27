package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author edgar
 *
 */
public class Establecimiento {
	
	private String nombre_Bar;
	private String descripcion;
	private String mail;
	private String tipo;
	private String barrio;
	private ArrayList<Categoria> carta;
	private ArrayList<Oferta> ofertas;
	
	/**
	 * TODO
	 * @param nombre_Bar
	 * @param descripcion
	 * @param mail
	 * @param tipo
	 * @param barrio
	 * @param carta
	 * @param ofertas
	 */
	public Establecimiento(String nombre_Bar,String descripcion,String mail,String tipo,String barrio, ArrayList<Categoria> carta,ArrayList<Oferta> ofertas) {
		this.nombre_Bar = nombre_Bar;
		this.descripcion = descripcion;
		this.mail= mail;
		this.tipo = tipo;
		this.barrio = barrio;
		this.carta = carta;
		this.ofertas = ofertas;
		
	}
	
	/**
	 * TODO
	 */
	public void mostrarCarta() {
		// inicializar vista de la carta y pasarle el String JSON lista de categoria para que lo muestre 
		String cartaJSON ="{[";
		for(Categoria c : carta) {
			cartaJSON += c.mostrarCategoria();
			cartaJSON += ",";
		}
		// eliminar ultima coma TODO
		cartaJSON +="]}";
		
		/**
		 * TODO integration
		 */
	}
	
	/**
	 * TODO
	 */
	public void mostrarEstablecimiento() {
		// inicializar vista del establecimiento y pasarle (nombre, descripción, mail, tipo, barrio y Lista ofertas) para que lo muestre
		String establecimientoJSON ="{nombre:"+nombre_Bar+", descripion:"+descripcion+",ofertas:[";
		for(Oferta o : ofertas) {
			establecimientoJSON += o.mostrarCategoria();
			establecimientoJSON += ",";
		}
		// eliminar ultima coma TODO
		establecimientoJSON +="]}";
		 
		/**
		 * TODO integration
		 */
	}
	
	/**
	 * TODO
	 * @param nombreCat
	 * @param nombreItem
	 */
	public void anadirCarritoItem(String nombreCat,String nombreItem) {
		Boolean enc=false;
		Iterator<Categoria> it = carta.iterator();
		Categoria catTofind= null;
		while(it.hasNext() && !enc) {
			Categoria next = it.next();
			if(next.is(nombreCat)) {
				enc=true;
				catTofind=next;
			}
		}
		// add an item to product selection
		Picotea.getInstance().anadirCarro(catTofind.anadirCarrito(nombreItem));
	}
	
	/**
	 * TODO
	 * @param nombreCat
	 * @param nombreItem
	 */
	public void anadirCarritoOferta(String nombreOferta) {
		Boolean enc=false;
		Iterator<Oferta> it = ofertas.iterator();
		Oferta theOffer= null;
		while(it.hasNext() && !enc) {
			Oferta next = it.next();
			if(next.is(nombreOferta)) {
				enc=true;
				theOffer=next;
			}
		}
		// add an item to product selection
		Picotea.getInstance().anadirCarro(theOffer);
	}
	
	
		
}
