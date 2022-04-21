package mx.com.proyecti;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8081/employee-hibernate-project/greeter", new Greeter());
		System.out.println("Starting service at puerto 8081");

	}

}
