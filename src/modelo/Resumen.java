package modelo;

public class Resumen {

	private static Resumen instance = null;
	
	/**
	 * TODO
	 */
	private Resumen() {
	
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
}
