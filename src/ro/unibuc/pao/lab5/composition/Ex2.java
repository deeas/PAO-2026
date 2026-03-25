package ro.unibuc.pao.lab5.composition;

/*
Modelați:
    •	Owner
	•	Room
	•	House
Cerințe:
    •	House are un Owner prin agregare;
	•	House are o Room prin compoziție;
	•	modificați din exterior obiectele trimise constructorului și observați ce se schimbă în House.
*/

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Room {
    private double width;
    private double length;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Room(Room other) {
        this.width = other.width;
        this.length = other.length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area() {
        return width * length;
    }
}

class House {
    private String address;
    private Owner owner; //agregare
    private Room diningRoom; //compozitia

    public House(String address, Owner owner, Room diningRoom) {
        this.address = address;
        this.owner = owner;
        this.diningRoom = new Room(diningRoom);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Room getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(Room diningRoom) {
        this.diningRoom = diningRoom;
    }

    public double getDiningRoomArea() {
        return diningRoom.area();
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Owner owner = new Owner("Ana");
        Room room = new Room(4, 5);

        House house = new House("Str. Florilor 10", owner, room);

        owner.setName("Maria");
        room.setWidth(10);

        System.out.println(house.getOwner().getName());
        System.out.println(house.getDiningRoomArea());
    }
}
