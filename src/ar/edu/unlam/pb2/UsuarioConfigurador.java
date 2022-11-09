package ar.edu.unlam.pb2;

public class UsuarioConfigurador extends Usuario implements Configurable{

	public UsuarioConfigurador(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Boolean agregarSensorAAlarma(Central central, Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, String codigoActivacionAlarma) throws Exception {
		Alarma alarma = central.buscarAlarmaPorId(idAlarma);
		alarma.agregarSensor(sensor);
		return true;
	}
	
}