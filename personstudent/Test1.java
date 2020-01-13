package personstudent;

class Student extends Person {
	private int rno;
	private double sub1;
	private double sub2;
	private double sub3;
	
	public Student() {
		super();
	}

	public Student(int ssn, String name, int age, int rno, double sub1, double sub2, double sub3) {
		super(ssn, name, age);
		this.rno = rno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public double getSub1() {
		return sub1;
	}

	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}

	public double getSub2() {
		return sub2;
	}

	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}

	public double getSub3() {
		return sub3;
	}

	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}
	
	
}