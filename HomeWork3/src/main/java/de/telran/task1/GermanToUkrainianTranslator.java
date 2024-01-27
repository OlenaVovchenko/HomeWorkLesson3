package de.telran.task1;

public class GermanToUkrainianTranslator extends TranslaterAbstract {
    public GermanToUkrainianTranslator(String name, int age, String gender, String[] languages) {
        super(name, age, gender, languages);
    }

    void translate(){
        System.out.println("Переводит с немецкого на украинский и наоборот");
    }
}
