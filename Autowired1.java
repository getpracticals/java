package Dependency_Injection;

public class Autowired1 {

	String name;
	String gender;
	
//	Gettters and Setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	Consturctor with and without fields 
	public Autowired1(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Autowired1() {
		super();
	}
	@Override
	public String toString() {
		return "Autowired1 [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
}
