package ar.edu.unlam.pb2;

public abstract class UsuarioConPoderes extends Usuario {

	public UsuarioConPoderes(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Boolean agregarUsuarioAAlarma(Central central, Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfiguracion) throws Exception {
		
		Usuario usuarioAAgregar = central.buscarUsuarioPorDni(dniUsuarioAAgregar);
		Alarma alarma = central.buscarAlarmaPorId(idAlarma);
		
		if(alarma.getCodigoConfiguracion().equals(codigoConfiguracion)) {				
			alarma.agregarUsuario(usuarioAAgregar);
		} 
		else {				
			throw new CodigoAlarmaIncorrectoException();
		}
		
		return true;
	}
	
	public Boolean agregarSensorAAlarma(Central central, Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador) throws Exception {
		
		Alarma alarma = central.buscarAlarmaPorId(idAlarma);
		
		if(!alarma.getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) return false;
		
		alarma.agregarSensor(sensor);
		
		return true;
	}
	
	public Boolean activarSensorDeAlarma(Alarma alarma, Integer idSensor) throws Exception {
		
		Sensor sensor = alarma.buscarSensorPorId(idSensor);
		
		sensor.setEstado(true);
		
		return sensor.getEstado();
		
	}
	
}
