package mx.com.proyecti;

// Tipos de datos primitivos inician con minúscula y no son considerados objetos, ejemplo
// int, float, double
public class GoodBonus {
	public static Double getBonusPercent(Employee employee) {
		if(employee instanceof Director) {
			return 0.05;
		} else if(employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println(manager.getDeptName());
			
			return 0.02;
		} else {
			return 0.01;
		}
	}
}
