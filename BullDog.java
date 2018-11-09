package project1;



public class BullDog extends Dog {

	public BullDog() {
	}

	public BullDog(boolean hasT, String faveF,String [] theTricks) {
		super(hasT, faveF, theTricks);
	}

	public BullDog(char gender, double weight, int age, boolean hasL, boolean hasT, String faveF) {
		super(gender, weight, age, hasL, hasT, faveF); // does not pass in the string array of tricks
	}
	
	public BullDog(char gender, double weight, int age, boolean hasL, boolean hasT, String faveF, String[] theTricks) {
		super(gender, weight, age, hasL, hasT, faveF, theTricks);
	}
	

	public String toString() {
		
		return super.toString()+"\n\tTHIS IS A BULLDOG";
	}
	
	@Override
	public void move() {
		System.out.println("I run slow!");
	}

	@Override
	public void eat() {
		System.out.println("this bulldog likes alot of food");
		
	}

	@Override
	public void speak() {
		System.out.print("WOOF, ");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}
}
