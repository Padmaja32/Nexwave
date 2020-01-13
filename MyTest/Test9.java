package MyTest;

import java.util.ArrayList;

class Student {
	int rno;
	String name;
	int age;
	public Student() {}
	public Student(int rno, String name, int age) {
		super();
		this.rno = rno;
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
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


	@Override
	public String toString() {
		return "Roll NO: " + rno + ", Name: " + name + ", Age: "+age;
	}
	
	
	
}

class Training {
	int trainingId;
	String traingName;
	ArrayList<Student> list = new ArrayList<>();
	public Training() {}
	public Training(int trainingId, String traingName, ArrayList<Student> list) {
		super();
		this.trainingId = trainingId;
		this.traingName = traingName;
		this.list = list;
	}
	
	
	public int getTrainingId() {
		return trainingId;
	}


	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}


	public String getTraingName() {
		return traingName;
	}


	public void setTraingName(String traingName) {
		this.traingName = traingName;
	}


	public ArrayList<Student> getList() {
		return list;
	}


	public void setList(ArrayList<Student> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "TRAINING DETAILS\nTraining Id=" + trainingId + ", Training Name=" + traingName + "\n\nLIST OF STUDENTS\n" + list;
	}
	
}
public class Test9 {
	public static void main(String args[]) {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student(1,"Ajay",18));
		list1.add(new Student(2,"Vijay",19));
		list1.add(new Student(3,"Shoumit",18));
		Training t1= new Training(101,"JAVA",list1);
		System.out.println(t1);
		
		
	}
}