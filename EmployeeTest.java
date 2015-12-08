package Hello

public class EmployeeTest{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		long empId = scanner.nextLong();
		System.out.println("Enter Employee Name");
		String empName = scanner.nextString();
		new Employee(empId,empName);
		System.out.println("Hello "+ empName);
	}
}
