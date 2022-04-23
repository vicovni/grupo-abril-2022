package mx.com.proyecti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//JAX-WS
@WebService
public class Greeter {
	
	private String message = "Hello World";
	
	public Greeter() {
		
	}
	
	@WebMethod(operationName="greetHi")
	public String greetWorld(@WebParam(name="FirstName") String name) {
		return message + name;
	}

}
