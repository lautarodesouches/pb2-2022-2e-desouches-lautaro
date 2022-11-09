package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Alarma {

	private Integer idDeAlarma;
	private Integer codigoDeActivacionYDesactivacion;
	private Integer codigoConfiguracion;
	private String nombre;
	private List<Usuario> listaUsuarios;
	private List<Accion> listaAccionesRealizadas;
	private List<Sensor> listaSensores;
	
	public Alarma(Integer idDeAlarma, Integer codigoDeActivacionYDesactivacion, Integer codigoConfiguracion,
			String nombre) {
		super();
		this.idDeAlarma = idDeAlarma;
		this.codigoDeActivacionYDesactivacion = codigoDeActivacionYDesactivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;
		this.listaUsuarios = new ArrayList<>();
		this.listaAccionesRealizadas = new ArrayList<>();
		this.listaSensores = new ArrayList<>();
	}
	
	public Integer getIdDeAlarma() {
		return idDeAlarma;
	}
	public void setIdDeAlarma(Integer idDeAlarma) {
		this.idDeAlarma = idDeAlarma;
	}
	public Integer getCodigoDeActivacionYDesactivacion() {
		return codigoDeActivacionYDesactivacion;
	}
	public void setCodigoDeActivacionYDesactivacion(Integer codigoDeActivacionYDesactivacion) {
		this.codigoDeActivacionYDesactivacion = codigoDeActivacionYDesactivacion;
	}
	public Integer getCodigoConfiguracion() {
		return codigoConfiguracion;
	}
	public void setCodigoConfiguracion(Integer codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Usuario> getUsuariosConfig() {
		return listaUsuarios;
	}
	public void setUsuariosConfig(List<Usuario> usuarios) {
		this.listaUsuarios = usuarios;
	}
	public List<Accion> getListaAccionesRealizadas() {
		return listaAccionesRealizadas;
	}
	public void setListaAccionesRealizadas(List<Accion> listaAccionesRealizadas) {
		this.listaAccionesRealizadas = listaAccionesRealizadas;
	}
	public List<Sensor> getListaSensores() {
		return listaSensores;
	}
	public void setListaSensores(List<Sensor> listaSensores) {
		this.listaSensores = listaSensores;
	}
	
	public void agregarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}

	public Integer obtenerCantidadUsuarios() {
		return listaUsuarios.size();
	}
	
}