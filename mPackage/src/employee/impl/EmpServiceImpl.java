package employee.impl;

import java.util.Scanner;

import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class EmpServiceImpl implements EmpService{

	@Override
	public void registerEmp(Employee emp, Employee[] ary) 
	{
		for(int i = 0 ; i<ary.length; i++)
		{
			if(ary[i] == null)
			{
				ary[i] = emp;
				break;
			}
		}
		
	}

	@Override
	public void searchEmp(int empId, Employee[] ary) 
	{
		for(int i = 0 ;i<ary.length; i++)
		{
			if(ary[i] != null && ary[i].getEmployeeID() == empId)
			{
				System.out.println("찾는분 정보이니라 ~");
				System.out.println(ary[i]);
			}
		}
	
		
	}

	@Override
	public void empList(Employee[] ary) 
	{
		int count = 0;
		for(int i = 0 ; i < ary.length-1; i++)
		{
			if(ary[i] != null )
			{
				System.out.println(ary[i]);				
			}
			if(count == ary.length)
			{
				System.out.println("등록된 사원이 없습니다.");
			}
			
		}
	
		
	}

	@Override
	public void updateSalary(int empId, Employee[] ary) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 월급값을 입력하시오: ");
		int changeSalary = sc.nextInt();
		for(int i = 0 ; i< ary.length; i++)
		{
			if(ary[i] != null && ary[i].getEmployeeID() == empId)
			{
				ary[i].setSalary(changeSalary);
			}
		}
		
		
	}

	@Override
	public void deleteEmp(int empId, Employee[] ary)
	{
		
		int count = 0;
		for(int i = 0 ; i< ary.length; i++)
		{			
			if(ary[i] != null && ary[i].getEmployeeID() == empId)
			{
				break;
			}
			count++;
		}	
		for(int i = count ; i < ary.length-1; i++)
		{						
			ary[i] = ary[i+1];			
		}
		
	}
	@Override
	public void changeDeptId(int empId, int deptId, Employee[] ary)
	{		
		for(int i = 0 ; i < ary.length; i++)
		{
			if(ary[i].getEmployeeID() == empId)
			{
				ary[i].setDepartmentId(deptId);
				break;
			}
		}
			
		
	}
	
	
	

}
