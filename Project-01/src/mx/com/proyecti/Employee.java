package mx.com.proyecti;

//POJO: Poor Old Java Object 
		//-- datos o atributos de tipo privado, nombre descriptivo
		//-- métodos de tipo público para inicializar y extraer el valor de los atributos
		//-- prefijo set, get
		//-- Definir un constructor por default sin argumentos

//Conceptos de Programación Orientada a Objetos (POO)
// -- Abstracción: Extraer información del mundo real y pasarlo a un contexto programable
// -- Encapsulamiento: Envolver u ocultar una implementación de nuesto código
// -- Herencia: Heredar las características del padre
// -- Polimorfismo: Asignar diferentes comportamientos a un objeto

public class Employee {
	// datos o atributos: definir las características de mi clase
	private int id;
	private String name;
	private String ssn;
	private Double salary;
	
	//métodos: Operaciones que puedo realizar sobre los datos de mi clase
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String ssn, Double salary) {
		super(); //Debe ser la primer instrucción de mi constructor, 
				//Llama al constructor por default de la clase padre (Object)
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	public String getDetails() {
		return "id " + this.id + ", name " + this.name + ", ssn  " + this.ssn + ", salary " + this.salary;
	}
	
	public double calcBonus() {
		return this.getSalary() * GoodBonus.getBonusPercent(this);
	}
}
