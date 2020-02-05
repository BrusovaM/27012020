package Lesson_3;

import java.io.Serializable;

public class Studens extends Human implements Serializable {
    int id;
    String name;

    transient Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public Studens(int id, String name) {
      //  super(1);
        this.id = id;
        this.name = name;
        System.out.println("Studens up!");
    }

    public void info() {
        System.out.println(id + " " + name);
    }
}
