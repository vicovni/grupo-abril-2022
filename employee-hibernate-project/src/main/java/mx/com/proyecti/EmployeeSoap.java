package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import mx.com.proyecti.entity.Employee;

@WebService
public class EmployeeSoap {

	private EmployeeManager manager;
	
	public EmployeeSoap() {
		manager = new EmployeeManager();
	}
	
	@WebMethod
	public Long createEmployee( @WebParam(name="fistName")String  firstName, 
			@WebParam(name="lastName") String lastName, 
			@WebParam(name="birthdate") Date birthdate, 
			@WebParam(name="salary") Double salary) {
		return manager.addEmployee(firstName, lastName, birthdate, salary);
	}
	
	@WebMethod
	public void updateEmployee(@WebParam(name="id") Long id, 
			@WebParam(name="firstName") String firstName,
			@WebParam(name="lastName") String lastName,
			@WebParam(name="birthdate") Date birthdate,
			@WebParam(name="salary") Double salary
			) {
		
		manager.updateEmployee(id, firstName, lastName, birthdate, salary);
	}
	
	@WebMethod
	public Employee readEmployee(@WebParam(name="id") Long id) {
		return manager.getEmployee(id);
	}
	
	@WebMethod
	public void deleteEmployee(@WebParam(name="id") Long id) {
		manager.deleteEmployee(id);
	}
	
	@WebMethod
	public List<Employee> getEmployees(){
		return manager.listEmployees();
	}
	
	
}
