package ar.edu.unlam.pb2;

public class UsuarioActivador extends Usuario implements Activable {

	public UsuarioActivador(Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	public void activarAlarma(Alarma alarma) {
		alarma.setActiva(true);
	}

	public void desactivarAlarma(Alarma alarma) {
		alarma.desactivarSensores();
		alarma.setActiva(false);
	}

	@Override
	public Boolean activarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception {
		
		return null;
	}

	@Override
	public Boolean desactivarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception {
		
		return null;
	}
}