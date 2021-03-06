package rooms;

import game.GameRunner;
import items.Item;
import game.Person;

public class GameOver extends Room{

	private static final String yLoc = null;
	private Object xLoc;
	private game.Person occupant;
	
	
	public GameOver(boolean[] doors, Person[] people, Item[] items, int x, int y) {
		super(doors, people, items, x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("   _____          __  __ ______    ______      ________ _____  \r\n" + 
				"  / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\ \r\n" + 
				" | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) |\r\n" + 
				" | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  / \r\n" + 
				" | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\ \r\n" + 
				"  \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_\\");
		System.out.println("  Uh-oh, you've fell into a trap and have died. Maybe start over?");
		GameRunner.gameOff();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	

}
