package de.telran.task1;

public class EnglishToUkrainianTranslator extends TranslaterAbstract {

    public EnglishToUkrainianTranslator(String name, int age, String gender, String[] languages) {
        super(name, age, gender, languages);
    }

    void translate(){
    System.out.println("Переводит с английского на украинский и наоборот");
}
}