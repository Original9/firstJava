package employee.controller;

import java.util.Scanner;

import employee.impl.EmpServiceImpl;
import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class HumanResources {
	Scanner sc = new Scanner(System.in);
	Employee[] employees = new Employee[10]; // 주소 값이여서 변경해주면 값이 바뀐다.
	EmpService service = new EmpServiceImpl(); // service 종류에도 여러가지가 있을수있다 업데이트만할수 있는 서비스도 있고 Impl
	//서비스만 지원하는 객체도 있고 다중상속으로 생각해라 . class 상속에서 업캐스팅 다운캐스팅 관계가 아니다. 
	EmpServiceImpl service2 = new EmpServiceImpl();
	
	
	Department[] departments = 
		{
				new Department(10, "Administration"),
				new Department(20, "Maketing"),
				new Department(30, "Purchasing"),
				new Department(40, "Human Resource")
		};
	
	public void execute()
	{
		int menu = 0 ;
		while(true)
		{
			printMenu();
			menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				//System.out.println("등록");
				register();
				break;
			case 2:
				search();
				break;
			
			case 3:
				list();
				break;
			case 4:
				updateSalary();
				break;
			case 5:
				deleteEmp();
				break;
			case 6:
				changeDepartment();					
				break;
		
			}
			
			
		}
	}
	public void printMenu()
	{
		System.out.println("메뉴를 선택 1)등록 2)조회 3)전체리스트 4)월급수정 5)삭제 6)부서수정");		
	}
	public void register()
	{
		System.out.println("사번입력: ");
		int employeeId = sc.nextInt();sc.nextLine();
		System.out.println("이름입력: ");
		String firstName = sc.nextLine();
		System.out.println("성을입력: ");
		String lastName = sc.nextLine();
		System.out.println("급여입력: ");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.println("부서번호 입력:");
		int deptId = sc.nextInt(); sc.nextLine();
		Employee emp = new Employee(employeeId, firstName,lastName,salary,deptId);
		service.registerEmp(emp, employees);
	}
	public void search()
	{
		System.out.println("조회할 사번입력: ");
		int empId = sc.nextInt();
		service.searchEmp(empId, employees);
	}
	public void list()
	{
		System.out.println("전체 사원 리스트");
		System.out.println("=====================================================");
		System.out.printf("  %5s %5s %5s %5s %5s","사번","이름","성","급여","부서\n");
		System.out.println("=====================================================");
		service.empList(employees);
		System.out.println("=====================================================");
		
	}
	public void updateSalary()
	{
		// 없는 사원번호에 대한 예외 처리 추가해보기
		System.out.println("HR 사원번호를 입력하시오: ");
		int empId = sc.nextInt();		
		service.updateSalary(empId,employees);
	}
	public void deleteEmp()
	{
		System.out.println("삭제할 HR사원번호를 입력하시오: ");
		int empId = sc.nextInt();
		service.deleteEmp(empId, employees);
	}
	public void changeDepartment()
	{
		System.out.println("*부서 목록*");
		EmpService.showDept(departments);
		System.out.println("변경될 사원의 사원번호를 입력하시오: ");
		int temp = sc.nextInt();
		System.out.println("변경할 부서번호를 입력하시오: ");
		int changeDeptId = sc.nextInt();
		service.changeDeptId(temp, changeDeptId, employees);		
		
	}


}
