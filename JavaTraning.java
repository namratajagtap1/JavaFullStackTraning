/**
 * 
 */
package com.yash.trainingPractice;

/**
 * @author namrata.jagtap
 *
 */
public class JavaTraning {

	/**
	 * @param args
	 */
	String laptop;
	String board;
	String projector;
	String lights;
	String pen;
	String trainer;
	String table;
	/*
	 * String light="light"; String trainer="trainer"; String light1="light";
	 */
	
	

//getmethods
	String uselaptop() {
		return laptop;
	}

	
	public JavaTraning(String trainer, String table) {
		super();
		this.trainer = trainer;
		this.table = table;
	}


	String useboardtraing() {
		return laptop;
	}

	String useprojector() {
		return laptop;
	}

	// setmethods
	void uselaptop(String laptop) {
		this.laptop = laptop;
	}

	void useboardtraing(String board) {
		this.board = board;
	}

	void useprojector(String projector) {
		this.projector = projector;
	}
	

	public static void main(String[] args) {
		
		String name="four";
		String name1="four";
		String yes="nine";
		// TODO Auto-generated method stub
		JavaTraning traning = new JavaTraning("ashwini","high");
		/*
		 * traning.useboardtraing("black"); traning.uselaptop("Thinkpad");
		 * traning.useprojector("iso");
		 */
		
		System.out.println(traning.uselaptop());
		
		System.out.println(traning.hashCode());
		
		System.out.println(name.hashCode()+name1.hashCode()+yes.hashCode());
	}

}
