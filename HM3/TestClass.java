package fmi.informatics.extending;

import java.util.ArrayList;

import fmi.informatics.composition.RichStudent2;

public class TestClass 
{

	public static void people(ArrayList<Person> people) 
	{
		people.add(new Student("Ivailo", 425, "PU", "Mathematic", 6666));
		people.add(new Student("Preslav", 745, "SU", "INF", 3232));
		people.add(new Professor("Professor", "Dimitrov", true, 50, 400, 65));
		people.add(new Professor("Professor", "Ivanov", true, 35, 500, 60));
		people.add(new RichStudent2("Esmeralda", 6266, "PU", "INF", 3223));
	}

	public static void showStats(ArrayList<Person> people) 
	{
		int stuCount = 0, profCount = 0, richCount = 0;
		for (int i = 0; i < people.size(); i++) {
		}

		System.out.println("The number of students: " + stuCount + "\nThe number of professors : " + profCount + "\n and number of rich students : " + richCount);
		System.out.println("\nThe total people here are: " + (stuCount + profCount + richCount) + "\n");
	}
	
	public static void test()
	{
		Student student = new Student("Nick", 425, "PU", "BIT", 6455) 
		{
			@Override
			public void study() {
				System.out.println("\nThe student is studying every day.");
			}

			@Override
			public void think() {
				System.out.println("\nThe student is thinking for party.");
			}
			
			@Override
			public void act() {
				System.out.println("\nThe student is acting now.");
			}
		};
		
		student.study();
		student.think();
		student.act();

	}

	public static void ClassnewInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class<?> classForName = Class.forName(Student.class.getName());
		System.out.println("\nThe student's class for name is: " + classForName);
		Student studentnewInstance = (Student) classForName.newInstance();
		studentnewInstance.takeExam();
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		ArrayList<Person> people = new ArrayList<>();
		people(people);
		showStats(people);
		test();
		ClassnewInstance();
	}

}
