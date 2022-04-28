package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

//@Service registra esta clase en el marco de Spring para que otras clases puedan inyectarse con ella
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired // Inicializa o autocablea la creación de objetos cuando sea requerido
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public Long insertEmployee(Employee employee) {
		return employeeRepository.save(employee).getId();
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		Employee emp = employeeRepository.findOne(employee.getId());
		if(emp!=null) {
			emp.setBirthdate(employee.getBirthdate());
			emp.setFirstName(employee.getFirstName());
			emp.setLastName(employee.getLastName());
			emp.setSalary(employee.getSalary());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Boolean deleteEmployee(Long id) {
		employeeRepository.delete(id);
		return true;
	}

}
