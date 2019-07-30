package employee.model;

public interface EmpService 
{
	public void registerEmp(Employee emp, Employee[] ary);
	public void searchEmp(int empId, Employee[] ary);
	public void empList(Employee[] ary);
	public void updateSalary(int empId, Employee[] ary);
	public void deleteEmp(int empId, Employee[] ary);
	public void changeDeptId(int beforeID, int deptId, Employee[] ary);
	default void setDept(int empId, int deptID, Employee[] ary)
	{
		for(int i = 0 ; i < ary.length; i++)
		{
			if(ary[i] != null && ary[i].getEmployeeID() == empId)
			{
				ary[i].setDepartmentId(deptID);
			}
		}
	}
	static void showDept(Department ary[])
	{
		for(int i = 0 ; i < ary.length; i++)
		{
			System.out.println(ary[i]);
		}
		
	}

}
