package ar.edu.unlam.pb2;

public class UsuarioAdminisrador extends Usuario{

	public UsuarioAdminisrador(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	public Boolean agregarAlarma(Central central, Alarma alarma) {
		central.registrarAlarma(alarma);
		return true;
	}
	
	public Boolean agregarUsuario(Central central, Usuario usuario) {
		central.registrarUsuario(usuario);
		return true;
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
	
}
