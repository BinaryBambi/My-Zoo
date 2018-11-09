package project1;

public class Penguin extends Bird {
	/**
	 * NOTE: Penguin cannot fly! EVER!!! NEVER!
	 */
	public Penguin(){
		super();//parent's default constructor
		super.setCanFly(false);//make sure the special Penguin Bird cannot fly
	}
	
	public Penguin(double beakLength){
		super(false, beakLength);//cannot fly!!!! 
	}
	
	public Penguin(char gender, double weight, int age, boolean hasLegs, double beakLength){
		super(gender, weight, age, hasLegs, false, beakLength);//cannot fly!!!! 
	}
	
	@Override
	public void setCanFly(boolean canFlyOrNot){
		if(canFlyOrNot){
			System.out.println("Penguins don't fly come on!");
		}
	}
	
	public String toString(){
		
		return super.toString()+"\n\tTHIS BIRD IS A PENGUIN";
	}
	
	@Override
	public void move() {
		System.out.println("I wobble not Fly!");
	}

	@Override
	public void eat() {
		System.out.println("I love Fish!");
		
	}

	@Override
	public void speak() {
		System.out.print("Brr, Heeh, ");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}
}