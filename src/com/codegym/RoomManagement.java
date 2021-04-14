package com.codegym;

public class RoomManagement {
    private Room[] rooms;

    public RoomManagement(Room[] rooms) {
        this.rooms = rooms;
    }

    public RoomManagement() {
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void inputRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].inputRoomInfo();
        }
    }

    public Room[] addNewRoom(Room room) {
        Room[] newRooms = new Room[this.rooms.length + 1];
        for (int i = 0; i < this.rooms.length; i++) {
            newRooms[i] = rooms[i];
        }
        newRooms[this.rooms.length] = room;
        this.rooms = newRooms;
        return this.rooms;
    }

    public void showRooms() {
        for (Room room : rooms) {
            room.showRoomInfo();
        }
    }

    public int findCustomerById(String id) {
        int index = -1;
        for (int i = 0; i < rooms.length; i++) {
            if (id.equals(rooms[i].getCustomer().getIdentity())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Room[] deleteCustomer(String id) {
        Room[] newRooms = new Room[rooms.length - 1];
        int index = findCustomerById(id);
        if (index != -1) {
            for (int i = 0; i < index; i++) {
                newRooms[i] = rooms[i];
            }
            for (int i = index + 1; i < newRooms.length; i++) {
                newRooms[i - 1] = rooms[i];
            }
            this.rooms = newRooms;
        }
        return this.rooms;
    }

    public Room[] totalMoneyForPayment(String id) {
        int index = findCustomerById(id);
        if (index == -1) {
            System.out.println("Không có thông tin của khách hàng này");
            return rooms;
        } else {
            System.out.println("Giá phòng cần thanh toán " + rooms[index].getDay() * rooms[index].getPrice());
            return deleteCustomer(id);
        }
    }
}
