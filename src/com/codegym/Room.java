package com.codegym;

import java.util.Scanner;

public class Room {
    private double day;
    private String type;
    private double price;
    private Person customer = new Person();

    public Room() {
    }

    public Room(double day, String type, double price, Person customer) {
        this.day = day;
        this.type = type;
        this.price = price;
        this.customer = customer;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public void inputRoomInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số ngày trọ:");
        this.day = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Loại phòng trọ:");
        this.type = scanner.nextLine();
        System.out.println("Giá phòng:");
        this.price = scanner.nextDouble();
        this.customer.inputPersonInfo();
    }

    public void showRoomInfo() {
        customer.showPersonInfo();
        System.out.printf(" số ngày trọ: %f, loại phòng: %s, giá phòng %f\n", this.day, this.type, this.price);
    }
}
