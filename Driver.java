package project1;

import java.util.Arrays;

public class Driver {


	public static void main(String[] args) {

		String [] funTricks = {"sit","sing"}; // the length of this array is two
		String [] funTricks2 = {"jump", "attack","sit","paw","sing"};

		Dog dog1 = new Dog('m',100,4,true,true,"coffee",funTricks);
		Bird bird1 = new Bird('f',400,56,true,true,13.5);
		Penguin penguin1 = new Penguin('m', 150, 54, true, 14.7);
		Pigeon pigeon1 = new Pigeon('m', 140, 31, true, true, 51.2); 
		HummingBird hummingBird1 = new HummingBird('m', 1.2, 2, true, true, 87.45312);
		GermanShepherd germanShepherd1 = new GermanShepherd('m',90,3,true,true,"chocolate",funTricks2);
		BullDog BullDog1 = new BullDog('f',70,5,true,true,"burgers",funTricks);


		//		System.out.println(dog1);
		//		System.out.println(bird1);
		//		System.out.println(penguin1);
		//		System.out.println(pigeon1);
		//		System.out.println(hummingBird1);
		//		System.out.println(germanShepherd1);
		//		System.out.println(BullDog1);

	}
}
