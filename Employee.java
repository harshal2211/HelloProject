package hello;

public class Employee{
	private long empId;
	private String empName;

	public Employee(long empId, String empName){
		this.empId = empId;
		this.empName = empName;
		System.out.println("Object created");
	}

	@Override
	public boolean equals(Object object){
		if (object == null)
			return false;
		if (object == this)
			return true;
		if (getClass() != object.getClass())
			return false;
		Employee e = (Employee) object;
		return (this.getEmpId() == e.getEmpId());
	}

	@Override
	public int hashCode(){
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + Long.valueOf(getEmpId()).hashCode();
		return result;
	}

	public long getEmpId(){
		return this.empId;
	}

	public String getEmpName(){
		return this.empName;
	}

}
