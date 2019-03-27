package modelo;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private ArrayList<Item> productos;
	private ArrayList<Oferta> ofertas;
	private String nombre_bar;
	
	/**
	 * TODO
	 * @param productos
	 * @param ofertas
	 * @param nombre_bar
	 */
	public Pedido(ArrayList<Item> productos,ArrayList<Oferta> ofertas,String nombre_bar) {
		this.id=Picotea.getInstance().generateId();
		this.nombre_bar=nombre_bar;
		this.ofertas=ofertas;
		this.productos=productos;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public String mostrarPedido() {
		String pedido = "{nombre:"+nombre_bar+", items:[";
		for(Item i:productos) {
			pedido += i.mostrarItem();
			pedido += ",";
		}
		// eliminar ultima coma TODO
		pedido += "], ofertas: [";
		for(Oferta o:ofertas) {
			pedido += o.mostrarOferta();
			pedido += ",";
		}
		// eliminar ultima coma TODO
		pedido += "]}";
		return pedido;
	}
	

}
