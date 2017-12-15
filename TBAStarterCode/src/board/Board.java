package board;

import rooms.Room;

public class Board {


    private Room[][] map;



    public Board(Room[][] schoolMap)
    {
        this.map = schoolMap;
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
    public Room[][] getSchoolMap() {
        return map;
    }

    public void setSchoolMap(Room[][] schoolMap) {
        this.map = map;
    }


}
