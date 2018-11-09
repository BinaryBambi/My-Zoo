package project1;

public class Pigeon extends Bird {

	public Pigeon() {
		super();
	}

	public Pigeon(boolean canFly, double beakLen) {
		super(canFly, beakLen);
		
	}

	public Pigeon(char gender, double weight, int age, boolean hasLegs, boolean canFly, double beakLen) {
		super(gender, weight, age, hasLegs, canFly, beakLen);
		
	}
	
	public String toString(){
		
		return super.toString()+"\n\tTHIS BIRD IS A PIGEON";
	}
	
	@Override
	public void move() {
		System.out.println("Im lazy i glide!");
	}

	@Override
	public void eat() {
		System.out.println("what dont i eat!");
		
	}

	@Override
	public void speak() {
		System.out.print("Coo roo, ");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}

}
