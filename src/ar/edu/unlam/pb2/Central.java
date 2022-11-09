package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Central {

	private List<Alarma> alarmas;
	private List<Usuario> usuarios;
	
	public Central() {
		super();
		this.alarmas = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public List<Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(List<Alarma> alarmas) {
		this.alarmas = alarmas;
	}

	public void registrarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}
	
	public Integer obtenerCantidadAlarmas() {
		return alarmas.size();
	}
	
	public void registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public Integer obtenerCantidadUsuarios() {
		return usuarios.size();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario buscarUsuarioPorDni(Integer dniUsuarioAAgregar) throws UsuarioNoEncontradoException {
		
		for (Usuario usuario : usuarios) {
			if(usuario.dni.equals(dniUsuarioAAgregar)) return usuario;
		}
		
		throw new UsuarioNoEncontradoException();
	}

	public Alarma buscarAlarmaPorId(Integer idAlarma) throws AlarmaNoEncontradaException {
		for (Alarma alarma : alarmas) {
			if(alarma.getIdDeAlarma().equals(idAlarma)) return alarma;
		}
		throw new AlarmaNoEncontradaException();
	}
	
}
