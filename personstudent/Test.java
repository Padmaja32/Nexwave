package personstudent;

class Person implements java.io.Serializable {
	private int ssn;
	private String name;
	private int age;
	
	
	public Person() {
		super();
	}
	public Person(int ssn, String name, int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

