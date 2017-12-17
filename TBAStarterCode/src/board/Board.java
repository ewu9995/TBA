package board;

import rooms.Room;

public class Board {


    private Room[][] map;



    public Board(Room[][] map)
    {
        this.map = map;
    }

    public void printMap()
    {


        for(Room[] row : map)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getMap() {
        return map;
    }

    public void setMap(Room[][] map) {
        this.map = map;
    }


}
