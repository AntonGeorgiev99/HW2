package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class TestMain 
{
	public static void main(String[] args) 
	{
		Student student = new Student("Valentin", 425, "PU", "INF", 5432);
		unit.testStudent(student);
	}
}
