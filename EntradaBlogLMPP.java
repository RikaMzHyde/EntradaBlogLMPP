package EDE;

/**
 * Clase para manejar las entradas de un blog. La clase se creó el 16/02/2023
 * por Laura María Pinedo Puertas. Esta es la versión 2.5.
 */

public class EntradaBlogLMPP {

	/**
	 * separador es el ccarácter que separa ENTRADA DE del nombre del autor
	 */
	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor de la clase. recibe el número de entrada, el nombre del autor de
	 * la entrada y el texto que contiene la entrada. Si el número de entrada es
	 * negativo, lanza una excepción.
	 * 
	 * @param id    Hace referencia al id del artículo.
	 * @param autor Hace referencia al autor del artículo.
	 * @param texto Texto que describe el artículo.
	 * @throws IllegalArgumentException Si el id es negativo.
	 */

	public EntradaBlogLMPP(int id, String autor, String texto) throws IllegalArgumentException {
		if (id <= 0)
			throw new IllegalArgumentException("El id no puede ser negativo");
		this.id = id;
		this.autor = autor;
		this.texto = texto;
	}

	/**
	 *
	 * @return Devuelve la cadena de texto con la frase: "ENTRADA DE" + el separador
	 *         + autor.
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n " + texto;
		return cad;
	}

	/**
	 *
	 * @return Devuelve el número de la entrada.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 *
	 * @return Devuelve el texto completo de la entrada.
	 */
	public String getTexto() {
		return this.texto;
	}

	/**
	 *
	 * @return Devuelve el nombre del autor de la entrada en mayúsculas.
	 */
	public String getAutor() {
		return this.autor.toUpperCase();
	}

	/**
	 *
	 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
	 */
	public String devuelveAutor() {
		return this.autor;
	}

	/**
	 *
	 * @param args No tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
		// Modificar.
		EntradaBlogLMPP e1 = new EntradaBlogLMPP(7, "Laura María",
				"Últimas noticias, el eclipse solar tendrá lugar el día 2 de Marzo.");
		System.out.println(e1);
	}
}