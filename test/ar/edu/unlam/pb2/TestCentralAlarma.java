package ar.edu.unlam.pb2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestCentralAlarma {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,"1234","4321","Alarma-1");
		UsuarioAdminisrador admin = new UsuarioAdminisrador(2465, "Pedro");
		
		admin.agregarAlarma(central, alarma);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = central.obtenerCantidadAlarmas();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,"1234","4321","Alarma-1");
		UsuarioAdminisrador admin = new UsuarioAdminisrador(2465, "Pedro");
		UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(7542, "Juan");
		
		admin.agregarUsuario(central, usuarioConfig);
		admin.agregarAlarma(central, alarma);
		
		try {
			admin.agregarUsuarioAAlarma(central,7542, 1, "4321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Integer valorEsperado = 1;
		Integer valorObtenido = alarma.obtenerCantidadUsuarios();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test (expected=CodigoAlarmaIncorrectoException.class)
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoException() throws Exception {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,"1234","4321","Alarma-1");
		UsuarioAdminisrador admin = new UsuarioAdminisrador(2465, "Pedro");
		UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(7542, "Juan");
		
		admin.agregarUsuario(central, usuarioConfig);
		admin.agregarAlarma(central, alarma);
		
		admin.agregarUsuarioAAlarma(central,7542, 1, "0000");
		
	}
	
	@Test (expected=SensorDuplicadoException.class)
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoException() throws Exception {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,"1234","4321","Alarma-1");
		UsuarioAdminisrador admin = new UsuarioAdminisrador(2465, "Pedro");
		UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(7542, "Juan");
		Sensor sensor = new Sensor(1, false);
		Sensor sensorDuplicado = new Sensor(1, false);
		
		admin.agregarUsuario(central, usuarioConfig);
		admin.agregarAlarma(central, alarma);
		admin.agregarUsuarioAAlarma(central,7542, 1, "4321");
		
		usuarioConfig.agregarSensorAAlarma(central, 1, "4321", sensor, "1234");
		usuarioConfig.agregarSensorAAlarma(central, 1, "4321", sensorDuplicado, "1234");
		
	}
	
	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,"1234","4321","Alarma-1");
		UsuarioAdminisrador admin = new UsuarioAdminisrador(2465, "Pedro");
		UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(7542, "Juan");
		Sensor sensor1 = new Sensor(1, true);
		Sensor sensor2 = new Sensor(2, true);
		
		admin.agregarUsuario(central, usuarioConfig);
		admin.agregarAlarma(central, alarma);
		
		try {
			
			admin.agregarUsuarioAAlarma(central,7542, 1, "4321");
			usuarioConfig.agregarSensorAAlarma(central, 1, "4321", sensor1, "1234");
			usuarioConfig.agregarSensorAAlarma(central, 1, "4321", sensor2, "1234");
			
			assertTrue(admin.activarAlarma(alarma, "1234"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
