package project1;

public class Bird extends Animal {

	private boolean canFly = true;
	private double beakLength;
	
	public Bird() {
		super();
		canFly = true;
		beakLength = 0;
		
	}
	
	public Bird(boolean canFly, double beakLength){
		super();
		this.canFly = canFly;
		this.beakLength = beakLength;
	}

	public Bird(char gender, double weight, int age, boolean hasLegs, boolean canFly, double beakLength){
		super(gender,weight,age,hasLegs);
		this.canFly = canFly;
		this.beakLength = beakLength;
	}
	
	//getters
	public boolean getCanFly(){
		return canFly;
	}
	public double getBeakLength(){
		return beakLength;
	}
	
	//setters
	public void setCanFly(boolean canFlyOrNot){
		canFly = canFlyOrNot;
	}
	public void setBeakLenght(double beakLength){
		this.beakLength = beakLength;
	}
	
	public String toString(){
		String s = super.toString();
			
			if(canFly){
				s +="\n\tBird: can fly";
			}
			else{
				s += "\n\tBird: cannot fly";
			}
			s+= ", Beak Length = "+beakLength;
			return s;
	}
	
	public boolean equals(Object o){
		if(o instanceof Bird){
			Bird otherBird = (Bird)o;
			if(super.equals(otherBird)){
				if(this.canFly == otherBird.canFly){
                    return this.beakLength == otherBird.beakLength;
				}
			}
		}
		return false;
	}

	@Override
	public void move() {
		System.out.println("birds Fly away!");
	}

	@Override
	public void eat() {
		System.out.println("birds like food");
		
	}

	@Override
	public void speak() {
		System.out.println(" what do birds say");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}
	
	
}
