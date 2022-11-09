package ar.edu.unlam.pb2;

public class SensorDuplicadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3743816240442599383L;
	
	public SensorDuplicadoException() {
		super("Ya existe un sensor con ese ID");
	}

}
