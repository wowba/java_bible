package ch6test;

import java.text.DecimalFormat;

public class Exercise6_4 {
	public static void main(String[] args) {
		// Student s = new Student();
		// s.name = "홍길동";
		// s.ban = 1;
		// s.no = 1;
		// s.kor = 100;
		// s.eng = 60;
		// s.math = 76;
		// System.out.println("이름: "+s.name);
		// System.out.println("총점: "+s.getTotal());
		// System.out.println("평균: "+s.getAverage());

		Student s = new Student("김철수",1,1,100,60,76);
		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;




	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public String getAverage() {
		DecimalFormat df = new DecimalFormat("0.0");
		return df.format(getTotal() / 3f);
	}

	public String info() {

		return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + ","
			+ this.getTotal() + "," + this.getAverage();
	}

}
