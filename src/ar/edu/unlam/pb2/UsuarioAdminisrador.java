package ar.edu.unlam.pb2;

public class UsuarioAdminisrador extends UsuarioConPoderes implements Activable{

	public UsuarioAdminisrador(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Boolean agregarAlarma(Central central, Alarma alarma) {
		central.registrarAlarma(alarma);
		return true;
	}
	
	public Boolean agregarUsuario(Central central, Usuario usuario) {
		central.registrarUsuario(usuario);
		return true;
	}
	
	public Boolean activarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception {
		
		if(!alarma.getCodigoDeActivacionYDesactivacion().equals(codigoDeActivacionYDesactivacion)) {
			return false;
			//throw new Exception("Codigo configuracion incorrecto");
		} 
		
		for (Sensor sensor: alarma.getListaSensores()) {
			
			if(!sensor.getEstado()) {
				//throw new Exception("No se pudo activar la alarma. El sensor " + sensor.getId() + " se encuentra desactivado");
				return false;
			}
		}
		
		return true;
		
	}
	
	public Boolean desactivarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception {
		
		if(!alarma.getCodigoDeActivacionYDesactivacion().equals(codigoDeActivacionYDesactivacion)) {
			return false;
			//throw new Exception("Codigo configuracion incorrecto");
		} 
		
		for (Sensor sensor: alarma.getListaSensores()) {
			sensor.setEstado(false);
		}
		
		return true;
		
	}
	
}
