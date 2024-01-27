package de.telran.task2;


public class MainDom {
    public static void main(String[] args) {
        ResidentsDom[] residents = {
                new ResidentsDom("Lena", 44),
                new ResidentsDom("Oliver", 50)
        };

        Dom myHouse = new SimpleDom(residents);
        myHouse.living();
    }
}