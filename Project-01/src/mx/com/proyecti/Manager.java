package mx.com.proyecti;

public class Manager extends Employee {
	
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Manager(int id, String name, String ssn, Double salary, String deptName) {
		super(id, name, ssn, salary);
		this.deptName = deptName;
	}
	
	public String getDetails() {
		return super.getDetails() + ", dept Name:" + this.deptName;
	}
	

}
