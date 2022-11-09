package ar.edu.unlam.pb2;

public class UsuarioConfigurador extends UsuarioConPoderes implements Configurable{

	public UsuarioConfigurador(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Boolean agregarSensorAAlarma(Central central, Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, String codigoActivacionAlarma) throws Exception {
		Alarma alarma = central.buscarAlarmaPorId(idAlarma);
		alarma.agregarSensor(sensor);
		return true;
	}

	@Override
	public Boolean agregarSensorAAlarma(Central central, Integer idAlarma, String codigoConfiguracionAlarma,
			Sensor sensor, Integer idUsuarioConfigurador) throws Exception {
		
		return null;
	}
	
}