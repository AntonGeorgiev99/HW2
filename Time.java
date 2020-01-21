package Task2;

public class Time {
	
	public void minutes(double out) {
		String notification = " ";
		if(out > 0.1 && out < 0.3) {
			notification = "The eggs are raw boil" ;
		}else if(out > 0.3 && out < 0.5) {
			notification = "The eggs are soft boil";
		}else if(out > 0.5 && out < 0.8) {
			notification = "The eggs are midle boil";
		}else if(out > 0.8) {
			notification = "The eggs are well done boil";
		}
		System.out.println("As the time"+out+"for min time"+notification);
	}
	
}
