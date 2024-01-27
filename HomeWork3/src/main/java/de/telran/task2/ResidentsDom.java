package de.telran.task2;

public class ResidentsDom {
    String name;
    int age;

    public ResidentsDom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ResidentsDom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
