package com.yash.exceptionasignment1;

public class TestE1 {

	public static void main(String[] args) throws ResultException {
		
		TestE1 test=new TestE1();
		StudentResult marks=new StudentResult(60, 40, 67, 89, 66);
		Student s=new  Student(1, "Namrata", "wagholi", marks);
		test.checkResult(s);
		
	}
	private void checkResult(Student st) throws ResultException {
		StudentResult sub=st.getSrobj();
		double maths=sub.getMaths();
		double hindi=sub.getHindi();
		double marathi=sub.getMarathi();
		double geometry=sub.getGeometry();
		double physics=sub.getPhysics();
		
		double obtainedmark=maths+hindi+marathi+geometry+physics;
		double percent=obtainedmark/500*100;
		if(percent<40||maths<40||hindi<40||marathi<40||geometry<40||physics<40) {
			throw  new ResultException("student failed");
		}else {
			System.out.println("student passed an got "+percent);
		}
		
	}

}
