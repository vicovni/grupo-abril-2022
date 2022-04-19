package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mx.com.proyecti.entity.Employee;

public class EmployeeManager {
	
	//Session Factory implementa el patr�n singleton y se crea s�lo al inicio de mi aplicaci�n
	private SessionFactory factory;

	public EmployeeManager() {
		try {
			factory = new Configuration().configure().buildSessionFactory(); //Leer mi archivo de configuraci�n para inicializar mi objeto
			//SessionFactory
		} catch (Throwable ex) {
			System.err.print("Failed to create sessionFactory object");
		}
	}
	
	public Long addEmployee(String firstName, String lastName, Date birthdate, double salary) {
		
		// Objeto sessi�n y se va a crear y a destruir cada vez que yo realice alg�n llamado a mi BD
		Session session = factory.openSession();
		
		//Permite abrir una transacci�n, en la cual nada se confirma hasta que llame al m�todo commit
		Transaction tx = null;
		Long id = null;
		
		try {
			tx = session.beginTransaction();
			Employee employee = new Employee(firstName, lastName, birthdate, salary);
			session.persist(employee);
			tx.commit();
			id = employee.getId();
		} catch (HibernateException e) {
			if(tx != null) tx.rollback(); // Si algo falla puedo llamar al m�todo rollback
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return id;
	}
	

	public Employee getEmployee(long id) {
		Session session = factory.openSession();
		Employee employee = null;
		try {
			employee = session.get(Employee.class, id); 
		} catch (HibernateException e) {
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return employee;
	}

	/* Method to  READ all the employees */
	public List<Employee> listEmployees( ){
		Session session = factory.openSession();
		Transaction tx = null;
		List<Employee> employees = null;

		try {
			tx = session.beginTransaction();
			employees = session.createQuery("FROM Employee", Employee.class).getResultList();
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return employees;
	}

	/* Method to UPDATE salary for an employee */
	public void updateEmployee(long id, int salary ){
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, id); 
			employee.setSalary(salary);
			session.persist(employee); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
	}

	/* Method to DELETE an employee from the records */
	public void deleteEmployee(long id){
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, id); 
			session.remove(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
	}
}
