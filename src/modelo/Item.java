package modelo;

public class Item {
	
	private String nombre;
	private Float precio;
	
	/**
	 * TODO
	 * @param nombre
	 * @param Precio
	 */
	public Item (String nombre,Float Precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public String mostrarItem() {
		return "{nombre:"+nombre+",precio:"+precio+"}";
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
