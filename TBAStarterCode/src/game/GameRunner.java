package game;

import java.util.Scanner;

import items.Item;
import rooms.Hallway;
import rooms.Person;
import rooms.Room;
import rooms.Utilities;




public class GameRunner {

	private static boolean gameOn = true;
    
	public static void main (String[] args)
    {
        Room[][] map = new Room[8][8];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};

                row[i] = new Hallway(doors, people, items, i, j);
            }

        }

        Room escape = new Room(map);


        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Escape Room, " + player1.getFirstName());
            System.out.println("Do you have what it takes to escape?");
            map[0][0].addOccupant(player1);

            escape.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(escape, player1,move);
           // gameOn = false;
            

        	boolean validMove(String move1, Person p, Room[][] map)
        	{
        		move = move.toLowerCase().trim();
        		switch (move) {
        			case "n":
        				if (p.getxLoc() > 0)
        				{
        					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
        					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
        					return true;
        				}
        				else
        				{
        					return false;
        				}
        			case "e":
        				if (p.getyLoc()< map[p.getyLoc()].length -1)
        				{
        					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
        					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
        					return true;
        				}
        				else
        				{
        					return false;
        				}

        			case "s":
        				if (p.getxLoc() < map.length - 1)
        				{
        					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
        					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
        					return true;
        				}
        				else
        				{
        					return false;
        				}

        			case "w":
        				if (p.getyLoc() > 0)
        				{
        					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
        					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
        					return true;
        				}
        				else
        				{
        					return false;
        				}
        			default:
        				break;
        					
        		}
        		return true;
        	}

        }
		in.close();
    }

	public static void gameOff() {
		gameOn = false;
		
	}

}



