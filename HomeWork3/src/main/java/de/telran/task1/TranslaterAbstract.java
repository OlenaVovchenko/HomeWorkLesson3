package de.telran.task1;
// 1 уровень сложности: 1) Есть абстрактный класс Переводчик, который имеет
// характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//         Реализовать данный класс и создать несколько классов различных
//         переводчиков с одного языка на другой.
//         Например с английского на русский, с русского на немецки и т.п.
//         Продумайте какова архитектура наследования будет в данном приложении.
public abstract class TranslaterAbstract {
    String name;
    int age;
    String gender;
    String[] languages;

    public TranslaterAbstract(String name, int age, String gender, String[] languages) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.languages = languages;
    }
    void person(){
        System.out.println(name + " " + age + " лет " + (gender.equals("man") ? "мужчина " : "женщина "));
    }
    abstract void translate();

}
