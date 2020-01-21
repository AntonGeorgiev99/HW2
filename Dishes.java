package Task2;

public class Dishes extends Eggs {

	public Dishes(short numbersOfEggs) {
		super(numbersOfEggs);
		
	}

	String nameOfDishes;
	
	public void chooseDishes(short numbersOfEggs,String nameOfDishes ) {
		if(numbersOfEggs == 1) {
			System.out.println("You put eggs in Kan");
		}
		if(numbersOfEggs <= 3 ) {
			System.out.println("You put eggs in Pot");
		}
		if(numbersOfEggs > 3) {
			System.out.println("You put eggs in Wock");
		}
	}
}
