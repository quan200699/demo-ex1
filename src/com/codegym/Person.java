package com.codegym;

import java.util.Scanner;

public class Person {
    private String name;
    private String date;
    private String identity;

    public Person() {
    }

    public Person(String name, String date, String identity) {
        this.name = name;
        this.date = date;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void inputPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên:");
        this.name = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        this.date = scanner.nextLine();
        System.out.println("Nhập CMT:");
        this.identity = scanner.nextLine();
    }

    public void showPersonInfo() {
        System.out.printf("Họ tên %s, ngày sinh %s, CMND %s", name, date, identity);
    }
}
