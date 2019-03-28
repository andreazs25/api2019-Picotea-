package modelo;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Resumen {

	private static Resumen instance = null;
	private ArrayList<Item> productos;
	private ArrayList<Oferta> ofertas;
	private String nombre_bar;
	
	
	/**
	 * TODO
	 */
	private Resumen() {
		productos = new ArrayList<Item>();
		ofertas = new ArrayList<Oferta>();
		nombre_bar = "";
	}
	
	/**
	 * TODO
	 * @return
	 */
	public static Resumen getInstance() {
		if (instance == null) {
			instance = new Resumen();
		}
		return instance;
	}
	
	/**
	 * TODO
	 * @param nombre_bar
	 */
	public void setBar(String nombre_bar) {
		this.nombre_bar=nombre_bar;
	}
	
	/**
	 * 
	 * @param producto
	 */
	public void anadirProducto(Item producto) {
		productos.add(producto);
	}
	
	/**
	 * 
	 * @param oferta
	 */
	public void anadirOferta(Oferta oferta) {
		ofertas.add(oferta);
	}
	
	/**
	 * 
	 */
	public void mostrarResumen() {
		JSONObject resumen = new JSONObject();
		resumen.put("nombre", nombre_bar);
		
		JSONArray arrayItem = new JSONArray();
		for(Item i : productos) {
			arrayItem.put(i.mostrarItem());
		}
		
		resumen.put("productos", arrayItem);
		
		JSONArray arrayOfer = new JSONArray();
		for(Oferta o:ofertas) {
			arrayOfer.put(o.mostrarOferta());
		}
		resumen.put("ofertas", arrayOfer);
		System.out.println(resumen.toString(4));
		
		// TODO integrate GUI resumen
	}
	
	/**
	 * TODO
	 */
	public void finalizarPedido() {
		// TODO aviso remoto de pedido realizado
		
		//registro local
		Pedido tmp = new Pedido(productos,ofertas,nombre_bar);
		Picotea.getInstance().registrarPedido(tmp);
		// re - init resumen
		instance = new Resumen();
	}
}
