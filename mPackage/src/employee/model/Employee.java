package employee.model;

public class Employee 
{
	private int employeeID;
	private String firstName;
	private String lastNmae;
	private int salary;
	private int deptId;
	public void Init()
	{
		this.employeeID = 0;
		this.firstName = null;
		this.lastNmae = null;
		this.salary = 0;
	}
	
	public Employee(int employeeID, String firstName, String lastNmae, int salary, int deptId) {
		//super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.salary = salary;
		this.deptId = deptId;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	

	@Override
	public String toString() {
		 
		System.out.printf("%7d %7s %7s %7d %7d",employeeID,firstName,lastNmae,salary,deptId);
		return " ";
		
	}

	public void setDepartmentId(int deptID) {
		// TODO Auto-generated method stub
		this.deptId = deptID;
		
	}

	
	

}
