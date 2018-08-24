package com.function.generic;

class Flower {
	String whatsYourName() {
		return "I have many names and types.";
	}
}

class Jasmine extends Flower {
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	@Override
	String whatsYourName() {
		return "Lily";
	}
}

class Lotus extends Flower {
	@Override
	String whatsYourName() {
		return "Lotus";
	}
}

class State {
	Flower yourNationalFlower() {
		return new Flower();
	}
}

class WestBengal extends State {
	@Override
	Jasmine yourNationalFlower() {
		return new Jasmine();
	}
}

class Karnataka extends State {
	@Override
	Lotus yourNationalFlower() {
		return new Lotus();
	}
}

class AndhraPradesh extends State {
	@Override
	Lily yourNationalFlower() {
		return new Lily();
	}
}

public class TestCovariantType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
