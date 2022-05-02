package mx.com.proyecti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;

import java.util.List;

@RestController // Identifica a esta clase como parte de la capa controladora y la hace visible hacia spring para inicializar objetos 
				// cuando se requiera
@RequestMapping("api") // Inicializar la ruta ra�z de mi servicio REST
						// http://localhost:8090/api...
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees") //Definir un endpoint que utilizar� la operaci�n GET
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

	@PostMapping("/employees") //Definir un endpoint para crear elementos, utiliza la operaci�n POST
	Long insertEmployee(
			@RequestBody Employee employee //@RequestBody indica que el par�metro de entrada viajar� en el cuerpo del mensaje
			) {
		return employeeService.insertEmployee(employee);
	}
	
	@GetMapping("/employees/{id}") // GET
	Employee getEmployee(
			@PathVariable Long id //@PathVariable indica que el par�metro de entrada viajar� como parte de la URL del endpoint
									//http://localhost:8090/api/employees/1
			) {
		System.out.println("Get employee");
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/employees") // Definir un endpoint para actualizar elementos, utiliza la operaci�n PUT
	Boolean updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employees/{id}") // Define un endpoint para eliminar elementos, utiliza la operaci�n DELETE
	Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}

}
