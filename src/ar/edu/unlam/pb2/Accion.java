package ar.edu.unlam.pb2;

import java.util.Date;

public class Accion {

	private Integer id;
	private Alarma alarma;
	private Usuario usuario;
	private Date fechaRealizada;
	private String tipoOperacion;
	
	public Accion(Integer id, Alarma alarma, Usuario usuario, Date fechaRealizada, String tipoOperacion) {
		super();
		this.id = id;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fechaRealizada = fechaRealizada;
		this.tipoOperacion = tipoOperacion;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Alarma getAlarma() {
		return alarma;
	}
	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFechaRealizada() {
		return fechaRealizada;
	}
	public void setFechaRealizada(Date fechaRealizada) {
		this.fechaRealizada = fechaRealizada;
	}
	public String getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	
}
