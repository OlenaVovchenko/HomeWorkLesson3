package de.telran.task1;

public class GermanToEnglishTranslator extends TranslaterAbstract {
    public GermanToEnglishTranslator(String name, int age, String gender, String[] languages) {
        super(name, age, gender, languages);
    }

    void translate(){
        System.out.println("Переводит с немецкого на английский и наоборот");
    }
}
