package mx.com.proyecti;

//Clase: Modelo, maqueta, molde de la funcionalidad que queremos implementar
//Objeto: Instancia de clase en ejecución

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Juan Lopez");
		employee.setSalary(1000D);
		employee.setSsn("41241515");
		
		System.out.print("Id de empleado " +employee.getName()+ ", ID ");

	}

}
