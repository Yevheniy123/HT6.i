package com.company;
public class Lecturer extends Person {
    public String place;
    public int money;

    public Lecturer(String fname, String sname, int year, String place, int money ) {
        super(fname, sname,  year);
        this.place = place;
        this.money = money;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        if (money > 10000 && money < 100000) {
            this.money = money;
        } else this.money = 10000;
    }
    public String printInfo() {
        return "Преподователь кафедры " + this.place + " " + this.fname + " " + this.sname + ", возраст: " + this.year + ".\n" +
                "Зарплата: " + this.money + ".";
    }
}

