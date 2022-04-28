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
@RequestMapping("api") // Inicializar la ruta raíz de mi servicio REST
						// http://localhost:8090/api...
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee") //Definir un endpoint que utilizará la operación GET
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

	@PostMapping("/employees")
	Long insertEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/employees")
	Boolean updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employees/{id}")
	Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}

}
