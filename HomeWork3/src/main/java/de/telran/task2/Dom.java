package de.telran.task2;
//Есть класс Дом и в нем живет много объектов типа Житель.
//        У Дома так же есть объекты Крыша, Стены, Окна, Двери.
//        Создайте класс для сущности Дом и ассоциированные с ним объекты, входящий в него.
//        Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.
public abstract class Dom {
    private Doors doors = new Doors();
    private Walls walls = new Walls();
    private Window window = new Window();
    private Roof roof = new Roof();
    private ResidentsDom[] residentsDom;

    public Dom(ResidentsDom[] residentsDom) {
        this.residentsDom = residentsDom;
    }

    public Dom() {

    }

    public ResidentsDom[] getResidentsDom() {
        return residentsDom;
    }

    public void setResidentsDom(ResidentsDom[] residentsDom) {
        this.residentsDom = residentsDom;
    }

    public void living() {
        System.out.println("Жильцы дома:");
        if (residentsDom != null) {
            for (ResidentsDom resident : residentsDom) {
                if (resident != null) {
                    System.out.println(resident);
                }
            }
        }
    }
}