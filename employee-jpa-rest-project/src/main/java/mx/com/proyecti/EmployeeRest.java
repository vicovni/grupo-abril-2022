package mx.com.proyecti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Le indica a la plataforma que esta clase representa el punto de inicio de una aplicación
//implementada con Spring boot
//Punto de arranque para el servicio web REST
@SpringBootApplication 
public class EmployeeRest {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRest.class, args);

	}

}
