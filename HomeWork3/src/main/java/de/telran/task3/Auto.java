package de.telran.task3;
//        Есть класс Авто со свои набором характеристик и поведения.
//        Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику,
//        а какие простому Водителю.
//        Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ
//        к методам класса Авто.
public class Auto implements AutoMechanic, Driver{
private String autoModel;
private int age;
private int mileage;

        public Auto(String bmv, int i, int i1) {
                this.autoModel = autoModel;
                this.age = age;
                this.mileage = mileage;
        }

        public String getAutoModel() {
                return autoModel;
        }

        public void setAutoModel(String autoModel) {
                this.autoModel = autoModel;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public int getMileage() {
                return mileage;
        }

        public void setMileage(int mileage) {
                this.mileage = mileage;
        }

        @Override
        public void carryTechnicalInspection() {
                System.out.println("профессионально обслуживаю машины");
        }

        @Override
        public void repairAuto() {
                System.out.println(" Провессионально ремонтирую машины ");
        }

        @Override
        public void drive() {
                System.out.println("я могу водить машину, если она поломалась, с вызову автомеханика");
        }

        @Override
        public void stay() {
                System.out.println("я могу при управлении машиной ее остановить");
        }

        @Override
        public void turnIgnition() {
                System.out.println("я могу включить зажигание в машине");
        }
}
