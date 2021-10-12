package com.company;
public  class Person implements IPerson {
    public String fname;
    public String sname;
    public int year;
    public Person(String fname, String sname, int year) {

        this.setFname(fname);
        this.setSname(sname);
        this.setYear(year);
    }
    public Person() { }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 16 && year < 100) {
            this.year = year;
        } else this.year = 18;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String printInfo() {
        return "Человек " + fname + " " + sname + ", возраст: " + year + ".";
    }
}

