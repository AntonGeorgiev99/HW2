package fmi.informatics.extending;

import java.util.Calendar;

public class Professor extends Person {

	private String title;
	
	public Professor() {
		
	}
	
	public Professor(String title, String name, boolean isMale,  int age, int height, int weight) {
		super(name, isMale, age, height, weight);
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("The professor %s is with title %s", this.getName(), this.getTitle());
	}

	
	@Override
	protected String getTypicalDrink() {
		return "50 years Black Johny";
	}

	
	@Override
	public void goBar() {
		super.goBar();
		System.out.println("After second drink the Professor is happy");
	}

	@Override
	public void getUpEarly(Calendar hour) {
		System.out.println("The professor usually gets up at" + hour);
	}

	// Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}