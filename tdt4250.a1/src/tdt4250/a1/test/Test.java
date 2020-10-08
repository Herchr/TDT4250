package tdt4250.a1.test;

import java.util.ArrayList;

import tdt4250.a1.A1Factory;
import tdt4250.a1.Semester;

public class Test {
	public static void main(String[] args) {
	/*ArrayList<String> strings1 = new ArrayList<String>();
	ArrayList<String> strings2 = new ArrayList<String>();
	
	strings1.add("2");
	strings1.add("3");
	strings2.add("3");
	System.out.println(strings2.containsAll(strings1));
	int year = (int) Math.ceil(3/2.0);
	System.out.println(year);*/
	Semester s = A1Factory.eINSTANCE.createSemester();
	System.out.println(s.getYear()+ "+" + s.getNumber());
	s.setNumber(5);
	System.out.println(s.getYear()+ "+" + s.getNumber());
	
	}

	

}
