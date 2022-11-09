package ar.edu.unlam.pb2;

public interface Activable {

	public Boolean activarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception;
	
	public Boolean desactivarAlarma(Alarma alarma, String codigoDeActivacionYDesactivacion) throws Exception;
	
}