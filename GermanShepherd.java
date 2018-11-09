package project1;

import project1.Dog;

public class GermanShepherd extends Dog {

	public GermanShepherd() {
	}

	public GermanShepherd(boolean hasT, String faveF, String [] theTricks) {
		super(hasT, faveF, theTricks);
	}

	public GermanShepherd(char gender, double weight, int age, boolean hasLegs, boolean hasTail, String faveFood) {
		super(gender, weight, age, hasLegs, hasTail, faveFood); // does not pass in the string array of tricks
	}
	
	public GermanShepherd(char gender, double weight, int age, boolean hasL, boolean hasT, String faveF,String[] theTricks) {
		super(gender, weight, age, hasL, hasT, faveF, theTricks);

	}

	public String toString() {

		return super.toString()+"\n\tTHIS IS A GERNMAN SHEPHERD";
	}

	@Override
	public void move() {
		
		System.out.println("I run fast!");
	}

	@Override
	public void eat() {
		
		System.out.println("this German Sheperd likes alot of food");

	}

	@Override
	public void speak() {
		
		System.out.print("Bark, ");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}

}
