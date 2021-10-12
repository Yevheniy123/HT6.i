package com.company;

import java.util.Arrays;

public class ClassRoom {


    Person[] classroom;
    int curentPupilsNumber;

    public ClassRoom() {
        this.classroom = new Person[0];
    }

    public ClassRoom(int pupilsNumber) {
        this.classroom = new Person[pupilsNumber];

        for (int i = 0; i < this.classroom.length; ++i) {
            this.classroom[i] = new Person();
        }

        this.curentPupilsNumber = 0;
    }

    public void addPupil(Person pupil) {
        Person[] temp = (Person[]) Arrays.copyOf(this.classroom, this.classroom.length + 1);
        temp[this.classroom.length] = pupil;
        this.classroom = temp;
    }

    public void addPupil(Person pupil, int position) {
        if (position < this.classroom.length) {
            this.classroom[position] = pupil;
        }

    }


    public String toString() {
        String result = System.lineSeparator();
        Person[] var2 = this.classroom;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Person pupil = var2[var4];
            result = result + pupil.toString() + System.lineSeparator();
        }

        return result;
    }
}