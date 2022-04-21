package mx.com.proyecti;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Greeter {
	
	private String message = "Hello World";
	
	public Greeter() {
		
	}
	
	@WebMethod
	public String greetWorld() {
		return message;
	}

}
