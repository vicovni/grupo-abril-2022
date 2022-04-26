package mx.com.proyecti;

import javax.xml.ws.Endpoint;

//Punto de arranque de un servicio web SOAP
public class Publish {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8081/employee-hibernate-project/employeesoap", new EmployeeSoap());
		System.out.println("Starting service at puerto 8081");

	}

}
