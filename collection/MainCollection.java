package collection;

import java.util.ArrayList;

public class MainCollection {

	public static void main(String[] args) {
		ArrayList<Voice> listVoice = new ArrayList<Voice>();
		listVoice.add(new Employee(234));
		listVoice.add(new Cat());
		for (Voice item : listVoice ){
			item.makeSound();
		}

	}

}
