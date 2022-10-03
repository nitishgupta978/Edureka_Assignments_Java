package model;
import javax.xml.bind.annotation.XmlRootElement;  
  
@XmlRootElement  
public class Student {  
private int id;  
	private String name;  
	private int std;
	private int marks;
	private String address;
	private String gender;
	
	Student(){
		
	}
	
	public Student(int id, String name, int std, int marks, String address, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.marks = marks;
		this.address = address;
		this.gender = gender;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", marks=" + marks + ", address=" + address
				+ ", gender=" + gender + "]";
	}

	 

}

