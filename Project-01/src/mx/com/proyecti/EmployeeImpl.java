package mx.com.proyecti;

//Clase: Modelo, maqueta, molde de la funcionalidad que queremos implementar
//Objeto: Instancia de clase en ejecución

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager(100, "Jorge López", "10101010", 1000D, "Marketing");
		employee.setName("Juan Lopez");
		employee.setSalary(1000D);
		employee.setSsn("41241515");
		
		
		System.out.println("Id de empleado " +employee.getName()+ ", ID ");
		System.out.println("Id de empleado" + manager.getName() + ", Dept Name " + manager.getDeptName());
		
		System.out.println(employee.getDetails());
		System.out.println(manager.getDetails());
	}

}
