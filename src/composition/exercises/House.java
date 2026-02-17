package composition.exercises;

/**
 TODO:
 1. Create class Room with fields: length, width.
 2. Add method getArea() in Room.
 3. Create class House that HAS-A Room.
 4. Add method printRoomArea() in House to delegate to Room.
*/

public class House
{
        private Room room;
    
        public House(double length, double width) {
            this.room = new Room(length, width);
        }
    
        public void printRoomArea() {
            System.out.println("Room area: " + room.getArea());
        }
}

class Room {
     private double length;
     private double width;

     public Room(double length, double width) {
          this.length = length;
          this.width = width;
     }

     public double getArea() {
          return length * width;
     }
}