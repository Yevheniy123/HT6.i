package com.company;
public class Main {
    public static void main(String[] args) {
        Person chelik = new Person( "Виноградов", "Евгений", 20) ;
        System.out.println(chelik.printInfo() );
        Lecturer rudchenko = new Lecturer("Rudchenko","Pavel", 25, "AD", 12000);
        System.out.println(rudchenko.printInfo() );
        Student chudak = new Student("Chudak","Yaroaslav", 18, "AD-201",23121);
        System.out.println(chudak.printInfo() );
        System.out.println("------------------------" );
        Person pArray[] = new Person[]{chelik,rudchenko,chudak };
        for (Person p : pArray) { System.out.println(p.printInfo()); } } }

