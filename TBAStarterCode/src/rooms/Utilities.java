package rooms;

import java.util.Scanner;

import board.Board;
import game.Person;
import rooms.Room;

public class Utilities {

	private static Person person;

	public static Person createPerson() {
		System.out.println("Please type your name");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		 
		return new Person ();
	}

	private String name;
	public String getFirstName() {
		// TODO Auto-generated method stub
		return name;
	}

	public static void movePlayer(Board escape, Person player1, String move) {
		
	}

}
