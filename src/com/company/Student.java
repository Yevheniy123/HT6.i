package com.company;
public  class Student extends Person {
    public String group;
    public int id;
    public Student(String fname, String sname, int year, String group, int id) {
        super(fname, sname, year);
        this.group = group;
        this.id = id;
    }
    public String getGroup() {
        return this.group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        if (id > 10000 && id < 100000) {
            this.id = id;
        } else {
            this.id = 10000;
        }
    }
    public String printInfo() {
        return "Студент группы " + group + " " + this.fname + " " + this.sname +
                " возраст: " + this.year + ".\nНомер студенческого билета: " + id + "";
    }
}

