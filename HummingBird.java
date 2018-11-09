package project1;

public class HummingBird extends Bird {

	public HummingBird() {
		super();
	}

	public HummingBird(boolean canFly, double beakLen) {
		super(canFly, beakLen);

	}

	public HummingBird(char gender, double weight, int age, boolean hasLegs, boolean canFly, double beakLen) {
		super(gender, weight, age, hasLegs, canFly, beakLen);

	}

	public String toString(){
		
		return super.toString()+"\n\tTHIS BIRD IS A HummingBird";
	}
	
	@Override
	public void move() {
		System.out.println("I Fly really Fast!");
	}

	@Override
	public void eat() {
		System.out.println("Humming Birds love Nector");
		
	}

	@Override
	public void speak() {
		System.out.print("Hummmmm, ");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}
}
