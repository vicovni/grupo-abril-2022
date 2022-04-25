package mx.com.proyecti.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Anotaciones son metadatos que relacionan los datos con algún otro componente de mi aplicación
@Entity //Voy a relacionar a la clase Employee como una entidad definida en una base de datos
@Table //Indica que la clase Employee va a representar a una tabla dentro de una base de datos
public class Employee {

	@Id //El campo id va a corresponder a la llave primaria de la tabla Employee dentro de Oracle
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
	@SequenceGenerator(name = "employee_generator", sequenceName = "EMPLOYEE_SEQUENCE", allocationSize = 1)
	private long id;
	private String firstName;
	private String lastName;
	private Date birthdate;
	private double salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String firstName, String lastName, Date birthdate, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.salary = salary;
	}
	
	
}
