package project1;


public class Dog extends Animal {
    //this Variables are attributes specific to the object "Dog"
    private boolean hasTail;
    private String faveFood;
    private String [] tricks;
	private int totalNumOfTricks = 5;

    public Dog(){
    	super(); //calls the parent default constructor
//    	tricks = new String[totalNumOfTricks];
        hasTail = true;
        faveFood = " bones ";

    }

    /**
     * @param hasT determines whether this object has a tail or not
     * @param faveF determines the favorite food of the object
     * @param theTricks determines which tricks a Dog has
     */
    public Dog (boolean hasT, String faveF, String [] theTricks){
       
    	super(); //calls the parent default constructor
        this.hasTail = hasT;
        this.faveFood = faveF;
        this.tricks = new String[totalNumOfTricks];

    }
    
    public Dog(char gender, double weight, int age, boolean hasLegs, 
				boolean hasTail, String faveFood){ 
    	
		super(gender,weight,age,hasLegs); //calls the parent's overloaded constructor
		this.hasTail = hasTail;
		this.faveFood = faveFood;
	}
    
    

    
    public Dog(char gender, double weight, int age, boolean hasLegs, 
			boolean hasTail, String faveFood, String [] theTricks){ 
    	
		super(gender,weight,age,hasLegs); //calls the parent's overloaded constructor
		this.totalNumOfTricks = theTricks.length;
		this.tricks = theTricks;
		this.hasTail = hasLegs;
		this.faveFood = faveFood;
	}
   
    public String getTricksAsString(){
		String s = "";
		int i=0;
		while(i < tricks.length-1 && tricks[i] != null){
			s += tricks[i] +", ";
			i++; //increment i
		}
		if( tricks[tricks.length-1] != null){
			s+= tricks[i];
		}
		return s;
    }
    
    @Override
	public String toString(){
		String s = super.toString();
		if(hasTail){
			s+="\n\tDog: has a tail";
		}
		else{
			s +="\n\tDog: does not have a tail";
		} 
		s += ", favorite food = "+faveFood;
		s += ", Tricks: "+ getTricksAsString();
		return s;
	}
    
    
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Dog){
			Dog otherDog = (Dog)o;
			if(super.equals(otherDog)){
				if(this.hasTail == otherDog.hasTail){
                    return this.faveFood.equalsIgnoreCase(otherDog.faveFood);
				}
			}
		}
		return false;
	}
	
	@Override
	public void move() {
		System.out.println("Dogs run away!");
	}

	@Override
	public void eat() {
		System.out.println("Dogs like food");
		
	}

	@Override
	public void speak() {
		System.out.println("What do dogs say");

	}

	@Override
	public void speak(int numTimes) {
		for(int i=numTimes; i>0; i--){
			speak();
		}
	}


}
