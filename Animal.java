package project1;


public class Animal implements Behaviors, Comparable <Animal> {

	private static int animalCounter = 0;
	private int animalNumber; // assign the animalCounter as an id for this specific Animal
	
	private char gender;
	private double weight;
	private int age;
	private boolean hasLegs;


	public Animal(){ // the default constructor
		animalCounter++;
		animalNumber = animalCounter;
		
		gender = 'U';
		weight = 0;
		age = 0;
		hasLegs = true;

	}

	
	public Animal (char gender, double weight, int age, boolean hasLegs){
		//this is the OL constructor for all Animal Attributes
		animalCounter++;
		animalNumber = animalCounter;
		
		setGender(gender);
		this.weight = weight;
		this.age = age;
		this.hasLegs = hasLegs;

	}

	//Getter methods
	public static int getTotalAnimalCount(){// static... no object needed to call the method
		return animalCounter;
	}
	
	public int getAnimalNumber() {// non-static.. belongs to individual object
		return animalNumber;
	}
	
	public char getGender() {
		return gender;
	}

	public double getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public boolean getHasLegs() {
		return hasLegs;
	}

	
	
	
	
	//Setter methods

	public void setGender(char gender) {
		switch(gender){
		case 'U':
		case 'F':
		case 'M':
			this.gender = gender;
			break;
		case 'u':
		case 'f':
		case 'm':
			this.gender = Character.toUpperCase(gender);
			break;
		default:
			System.out.println("INVALID GENDER CHAR!"+gender);
			this.gender = 'U';
		}

	}

	public void setWeight(double weight) {
		if(weight < 0){
			System.out.println("YOU TRIED TO SET A WEIGHT TO A INVALID VALUE "+ weight);
		}
		else{
			this.weight = weight;
		}

	}

	public void setAge(int age) {
		if(age < 0){
			System.out.println("YOU TRIED TO SET AN AGE TO A INVALID VALUE "+ age);
		}
		else{
			this.age = age;
		}

	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}

	
	public String toString(){               //The toString() Method
		//        uses the values that were
		String s= "Animal: gender "+ gender
				+", weight " + weight
				+ ", age "+ age;
		if (hasLegs){
			s = s + ", has Legs";
		}
		else{
			s = s + ", does not have legs";

			return s;
		}

		return s;

	}

	@Override
	public boolean equals(Object o) {       
		if (o instanceof Animal){           
			Animal otherAnimal = (Animal)o;
            return (this.gender == otherAnimal.gender)
                    && (this.age == otherAnimal.age)
                    && (this.weight == otherAnimal.weight
                    && (this.hasLegs == otherAnimal.hasLegs));
		}
		return false;
	}

	/* Uses the weight variable to compare 2 Animal objects
	 * return -1 when calling is less than passed in object
	 * return 1 when calling object is greater than passed in object
	 * return 0 when equal
	 */

	@Override
	public int compareTo(Animal otherAnimal) {

		if (this.weight > otherAnimal.weight) return 1;
		else if (this.weight == otherAnimal.weight){
			return 0;
		}
		else{
			return -1;
		}
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void speak(int numTimes) {
		// TODO Auto-generated method stub
		
	}


}
