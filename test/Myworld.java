package test;

 class Student {
	 private int rno;
	 private String name;
	 private double sub1;
	 private double sub2;
	 private double sub3;
	 
	 
	public Student(int rno, String name, double sub1, double sub2, double sub3) {
		super();
		this.rno = rno;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
 }
