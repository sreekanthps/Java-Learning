package org.sk.streams.data;

public class Users {
    int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String name;
    int age;

    public Users(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + "(" + this.age + ")";
    }
}
