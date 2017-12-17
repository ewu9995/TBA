package rooms;

import game.GameRunner;
import items.Item;
import rooms.Person;

public class WinningRoom extends Room {

	private Person occupant;
	private Object xLoc;
	private String yLoc;
	public WinningRoom(boolean[] doors, Person[] occupants, Item[] items, int x, int y) {
		super(doors, occupants, items, x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("The door locks behind you.... Is this is trap?");
		System.out.println("Someone's voice: You found the winning room. Here's an imaginary reward. *gives reward* ");
		GameRunner.gameOff();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	

}
