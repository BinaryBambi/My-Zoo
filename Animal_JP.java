package project1;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Animal_JP extends JPanel {
	
	private JPanel jp1, dataJp, buttonJp;
	private JLabel jlResult;
	private Animal [] animals = new Animal[8];
	private String [] funTricks = new String[5];

	public Animal_JP() {
		setLayout(new GridLayout(3,3));
		jp1 = new JPanel();	// created an instance of a JPanel
		jlResult = new JLabel("RESULTS GO HERE");
		jlResult.setFont(new Font(Font.SERIF,Font.BOLD, 12));
		
		dataJp = new DataPanel();
		buttonJp = new ButtonPanel();
		
		jp1.add(jlResult); // add the results label to the first panel
		add(jp1); // Adds the answer panel to the Animal JPanel
		add(dataJp); // Adds Data panel to to the Animal JPanel
		add(buttonJp); // Adds Button panel to to the Animal JPanel
	}//End Animal Jpanel Constructor
	
	private class DataPanel extends JPanel{
		
		private JLabel  jlAnimal, jlWeight, jlAge, jlGender, jlHasLegs,
						jlCanFly, jlBeakLength, jlHasTail, jlFaveFood, jlTricks;

		private JTextField  animalTF, weightTF, ageTF, genderTF, hasLegsTF,
							canFlyTF, beakLengthTF, hasTailTF, faveFoodTF, tricksTF;
		
		public DataPanel() {
			setLayout(new GridLayout(5,5));
			
			// JLabels
			jlAnimal = new JLabel("Animal");
			jlWeight = new JLabel("weight");
			jlAge = new JLabel("Age");
			jlGender = new JLabel("Gender");
			jlHasLegs = new JLabel("hasLegs");
			jlCanFly = new JLabel("Can Fly");
			jlBeakLength = new JLabel("Beak Length");
			jlHasTail = new JLabel("has tail"); 
			jlFaveFood = new JLabel("favorite food");
			jlTricks = new JLabel("tricks");

			// JTextFields
			animalTF     = new JTextField();
			weightTF     = new JTextField();
			ageTF        = new JTextField();
			genderTF     = new JTextField();
			hasLegsTF    = new JTextField();
			canFlyTF     = new JTextField();
			beakLengthTF = new JTextField();
			hasTailTF    = new JTextField();
			faveFoodTF   = new JTextField();
			tricksTF     = new JTextField();
			
			//added labels and text Fields
			add(jlAnimal);		add(animalTF);
			add(jlWeight);		add(weightTF);
			add(jlAge);			add(ageTF);
			add(jlGender);		add(genderTF);
			add(jlHasLegs);		add(hasLegsTF);
			add(jlHasTail);		add(hasTailTF);
			add(jlFaveFood);	add(faveFoodTF);
			add(jlTricks);		add(tricksTF);
			add(jlCanFly);		add(canFlyTF);
			add(jlBeakLength);	add(beakLengthTF);
		}// End of Data Panel Constructor

		public String getAnimal() {
//			String animal = animalTF.getText();
			return animalTF.getText();
		}
		public int getAge(){
			String ageAsString = ageTF.getText();
			if(ageAsString != null){
				return Integer.parseInt(ageAsString);
			}
			else{
				return 0;
			}
		}
		public double getWeight(){
			String weightAsString = weightTF.getText();
			if (weightAsString != null) {
				return Double.parseDouble(weightAsString);
			}
			else {
				return 0;
			}
		}
		public char getGender() {
			String genderAsString = genderTF.getText();
			if(genderAsString != null) {
				return genderAsString.charAt(0);
			}
			else {
				return 0;
			}
		}
		public boolean getHasLegs() {
			String hasLegsAsString = hasLegsTF.getText();
			if(hasLegsAsString != null) {
				return  Boolean.parseBoolean(hasLegsAsString);
			}
			else {
				return false;
			}
		}
		public boolean getCanFly() {
			String canFlyAsString = canFlyTF.getText();
			if(canFlyAsString != null) {
				return Boolean.parseBoolean(canFlyAsString);
			}
			else {
				return false;
			}
		}
		public double getBeakLength() {
			String beakLengthAsSting = beakLengthTF.getText();
			if(beakLengthAsSting != null) {
				return Double.parseDouble(beakLengthAsSting);
			}
			else {
				return 0;
			}
		}
		public boolean getHasTail() {
			String hasTailAsString = hasTailTF.getText();
			if(hasTailAsString != null) {
				return Boolean.parseBoolean(hasTailAsString);
			}
			else {
				return false;
			}
		}
		public String getFaveFood() {
			return faveFoodTF.getText();
		}
		public String[] getTricks() {
			String funTricks = tricksTF.getText();
			if (funTricks != null) {
				String[] funTricksArray = funTricks.split(",");
				return funTricksArray;
			}
			return null;
				
		}
		
				
	}// End of DataPanel Class

	private class ButtonPanel extends JPanel implements ActionListener{
		
		private String [] btnFaces = {"Create","Display","Update","Remove"};
		private JButton [] jbtns;//ADD,SUB,MUL,DIV
		
		public ButtonPanel() {
			setLayout(new GridLayout(1, btnFaces.length)); // sets the layout of the button
			jbtns = new JButton[btnFaces.length];		  // sets the length of Jbtns to the length of "btnFaces" (String)
			populatePanelWithButtons();
		} // End of Button Panel Constructor
		
		private void populatePanelWithButtons(){ //populates the array of jButtons
			for(int i=0; i<jbtns.length; i++){
				jbtns[i] = new JButton(btnFaces[i]);
				jbtns[i].addActionListener(this);
				add(jbtns[i]);
			}
		}

		private void createAnimal(String animal, char gender, double weight, int age, boolean hasLegs, boolean hasTail,
									String faveFood, boolean canFly, String[] tricks) {
			
			if("animal".equalsIgnoreCase(animal)){

				animals[0] = new Animal(gender,weight,age,hasLegs);
				System.out.println(animals[0]);
			}
			else if ("dog".equalsIgnoreCase(animal)){

				animals[1] = new Dog(gender,weight,age,hasLegs,hasTail,faveFood);
				System.out.println(animals[1]);
			}
			else if("bird".equalsIgnoreCase(animal)){

				double beakLength = ((DataPanel)dataJp).getBeakLength();
				animals[2] = new Bird(gender, weight, age, hasLegs, canFly, beakLength);
				System.out.println(animals[2]);
			}
			else if("BullDog".equalsIgnoreCase(animal) ||
					"Bull Dog".equalsIgnoreCase(animal)) {

				animals[3] = new BullDog(gender, weight, age, hasLegs,hasTail,faveFood, tricks);
				System.out.println(animals[3]);
			}
			else if("german Shepherd".equalsIgnoreCase(animal) ||
					"germanShepherd".equalsIgnoreCase(animal) ) {

				animals[4]  = new GermanShepherd(gender, weight, age, hasLegs,hasTail,faveFood, tricks);
				System.out.println(animals[4]);
			}
			else if("humming bird".equalsIgnoreCase(animal) || "hummingbird".equalsIgnoreCase(animal) ) {

				double beakLength = ((DataPanel)dataJp).getBeakLength();
				animals[5] = new HummingBird(gender, weight, age, hasLegs, canFly, beakLength);
				System.out.println(animals[5]);
			}
			else if("Penguin".equalsIgnoreCase(animal)) {

				double beakLength = ((DataPanel)dataJp).getBeakLength();
				animals[6] = new Penguin(gender, weight, age, hasLegs, beakLength);
				System.out.println(animals[6]);
			}
			else if("Pigeon".equalsIgnoreCase(animal)) {

				double beakLength = ((DataPanel)dataJp).getBeakLength();
				animals[7] = new Pigeon(gender, weight, age, hasLegs, canFly, beakLength);
				System.out.println(animals[7]);
			}
		}

		private void displayAnimal(String animal){
			if("animal".equalsIgnoreCase(animal)) {
				System.out.println(animals[0]);
				jlResult.setText(animals[0].toString());
			}
			else if("dog".equalsIgnoreCase(animal)) {
				System.out.println(animals[1]);
				jlResult.setText(animals[1].toString());
			}
			else if("bird".equalsIgnoreCase(animal)){
				System.out.println(animals[2]);
				jlResult.setText(animals[2].toString());
			}
			else if("BullDog".equalsIgnoreCase(animal) || "Bull Dog".equalsIgnoreCase(animal)) {
				System.out.println(animals[3]);
				jlResult.setText(animals[3].toString());
			}
			else if("german Shepherd".equalsIgnoreCase(animal) || "germanShepherd".equalsIgnoreCase(animal) ) {
				System.out.println(animals[4]);
				jlResult.setText(animals[4].toString());
			}
			else if("humming bird".equalsIgnoreCase(animal) || "hummingbird".equalsIgnoreCase(animal) ) {
				System.out.println(animals[5]);
				jlResult.setText(animals[5].toString());
			}
			else if("Penguin".equalsIgnoreCase(animal)) {
				System.out.println(animals[6]);
				jlResult.setText(animals[6].toString());
			}
			else if("Pigeon".equalsIgnoreCase(animal)) {
				System.out.println(animals[7]);
				jlResult.setText(animals[7].toString());
			}
		}

		private void updateAnimal(String animal, char gender, double weight, int age, boolean hasLegs, boolean hasTail,
				String favefood, boolean canFly, String[] tricks) {
					
					
			}

	
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("INSIDE ACTION pERFORMED");
			JButton btnClicked = (JButton) e.getSource();
			
			String 	 animal = ((DataPanel)dataJp).getAnimal();
			char 	 gender = ((DataPanel)dataJp).getGender();
			double 	 weight = ((DataPanel)dataJp).getWeight();
			int 		age = ((DataPanel)dataJp).getAge();
			boolean hasLegs = ((DataPanel)dataJp).getHasLegs();
			boolean hasTail = ((DataPanel)dataJp).getHasTail();
			String faveFood = ((DataPanel)dataJp).getFaveFood();
			boolean  canFly = ((DataPanel)dataJp).getCanFly();
			String []tricks = ((DataPanel)dataJp).getTricks();
			
			
			if(btnClicked.equals(jbtns[0])) { // create button
				createAnimal(animal, gender, weight, age, hasLegs, hasTail, faveFood, canFly, tricks);
			} // the end of create button

			if(btnClicked.equals(jbtns[1])) { // Display button
				animal = ((DataPanel)dataJp).getAnimal();
				displayAnimal(animal);
			}// end of Display button
			
			if(btnClicked.equals(jbtns[2])) { // Update button
				
				if("animal".equalsIgnoreCase(animal)) {
					
					animals[0] = new Animal(gender, weight, age, hasLegs);
					
					System.out.println(animals[0]);
				}
				else if("dog".equalsIgnoreCase(animal)) {
					
					animals[1] = new Dog(gender, weight, age, hasLegs,hasTail,faveFood, tricks);
					
					System.out.println(animals[1]);

				}

			}
			
			if(btnClicked.equals(jbtns[3])) { // Remove button

				if("animal".equalsIgnoreCase(animal)) {
					jlResult.setText("this animal has been deleted");
					animals[0] = null;
					System.out.println(animals[0]);
				}
				else if("dog".equalsIgnoreCase(animal)) {
					animals[1] = null;
					jlResult.setText("this dog has been deleted");
					System.out.println(animals[1]);
				}
				else if("bird".equalsIgnoreCase(animal)){
					jlResult.setText("this bird has been deleted");
					animals[2] = null;
					System.out.println(animals[2]);

				}
				else if("BullDog".equalsIgnoreCase(animal) || "Bull Dog".equalsIgnoreCase(animal)) {
					jlResult.setText("this Bull Dog has been deleted");
					animals[3] = null;
					System.out.println(animals[3]);
				}
				else if("german Shepherd".equalsIgnoreCase(animal) || "germanShepherd".equalsIgnoreCase(animal) ) {
					jlResult.setText("this German Shepherd has been deleted");
					animals[4]  = null;
					System.out.println(animals[4]);
				}
				else if("humming bird".equalsIgnoreCase(animal) || "hummingbird".equalsIgnoreCase(animal) ) {
					jlResult.setText("this humming bird has been deleted");
					animals[5] = null;
					System.out.println(animals[5]);
				}
				else if("Penguin".equalsIgnoreCase(animal)) {
					jlResult.setText("this Penguin has been deleted");
					animals[6] = null;
					System.out.println(animals[6]);
				}
				else if("Pigeon".equalsIgnoreCase(animal)) {
					jlResult.setText("this Pigeon has been deleted");
					animals[7] = null;
					System.out.println(animals[7]);
				}
			}

		} // end of action performed method



	} // End of Button Panel Class
	
}// End of Animal Jpanel