package com.mum.asd.labs.lab04;

public class Application {

    public static void main(String[] args) {
        Drive cdrive = new Drive("C");
        Directory coursesDir = new Directory("courses");
        Directory asdDir = new Directory("asd");
        File homework = new File("homework.pdf", 15);
        File lab = new File("lab.pdf", 16);
        asdDir.addComponent(homework);
        asdDir.addComponent(lab);
        coursesDir.addComponent(asdDir);
        cdrive.addComponent(coursesDir);
        cdrive.print();
    }
}
