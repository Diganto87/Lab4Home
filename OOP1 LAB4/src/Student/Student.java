package Student;

public class Student {
	
	private String name ;
	private String id ; 
	private String department;
	private double cgpa;
	public Student() {
		
	}
	public Student(String name, String id, String department, double cgpa) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	} 
	
	
	
	public void showinfo()
	{
		System.out.println(name+" "+id+" "+department+" "+cgpa);
		
		
	}
	
	
	
	
	
	
	

}
