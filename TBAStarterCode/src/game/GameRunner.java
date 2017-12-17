package game;

import java.util.Scanner;

import items.Item;
import rooms.Hallway;
import rooms.*;
import game.Person;
import rooms.Room;
import rooms.Rooms;
import rooms.Utilities;
import board.Board;




public class GameRunner {

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

       Board escape = new Board(map);


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
            







        }
		in.close();
    }

	public static void gameOff() {
		// TODO Auto-generated method stub
		
	}

}
