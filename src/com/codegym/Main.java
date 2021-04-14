package com.codegym;

/*
Để quản lý khách hàng đến thuê phòng trọ của một khách sạn,
 người ta cần quản lý những thông tin sau:
 - Số ngày trọ, loại phòng trọ, giá phòng,
  và các thông tin cá nhân về mỗi khách trọ.
  - Với mỗi cá nhân, người ta cần quản lý các thông tin : Họ và tên, ngày sinh,
   số chứng minh thư nhân dân.
   1. Hãy xây dựng lớpNguoiđể quản lý thông tin cá nhân về mỗi cá nhân
   2. Xây dựng lớpKhachSanđể quản lý các thông tin về khách trọ.
   3. Viết các phương thức : nhập, hiển thị, xóa các thông tin về một khách trọ,
   4. Cài đặt chương trình thực hiện các công việc sau:
   - Nhập vào một dãy gồm n khách trọ ( n - nhập từ bàn phím)
   - Hiển thị ra màn hình thông tin về các cá nhân hiện đang trọ ở khách sạn đó.
   - Tính số tiền cần phải trả nếu một khách hàng trả phòng trọ
   (căn cứ vào số CMND để tìm kiếm trong mảng)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số khách trọ");
        int n = scanner.nextInt();
        Room[] rooms = new Room[n];
        RoomManagement roomManagement = new RoomManagement(rooms);
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    roomManagement.inputRooms();
                    break;
                case 2:
                    //Hiển thị thông tin
                    roomManagement.showRooms();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập CMT cần xóa:");
                    String id = scanner.nextLine();
                    roomManagement.deleteCustomer(id);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập CMT cần tính tiền:");
                    id = scanner.nextLine();
                    roomManagement.totalMoneyForPayment(id);
                    break;
                case 5:
                    Room room = new Room();
                    room.inputRoomInfo();
                    roomManagement.addNewRoom(room);
                    break;
            }
        } while (choice != 0);
    }


    private static void menu() {
        System.out.println("1. Nhập thông tin khách trọ");
        System.out.println("2. Hiển thị thông tin khách trọ");
        System.out.println("3. Xóa thông tin khách trọ");
        System.out.println("4. Tính tiền cần thanh toán");
        System.out.println("5. Thêm thông tin khách trọ");
        System.out.println("0. Thoát");
    }
}
