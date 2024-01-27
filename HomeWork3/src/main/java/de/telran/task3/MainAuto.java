package de.telran.task3;
//        Есть класс Авто со свои набором характеристик и поведения.
//        Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику,
//        а какие простому Водителю.
//        Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ
//        к методам класса Авто.
public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Bmv", 5, 50000);
        auto1.carryTechnicalInspection();
        auto1.drive();
        auto1.stay();
        auto1.repairAuto();
    }
}
