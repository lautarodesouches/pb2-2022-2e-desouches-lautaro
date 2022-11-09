package ar.edu.unlam.pb2;

public class UsuarioNoEncontradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException() {
		super("No se encontro usuario");
	}
	
}