package de.telran.task1;
// 1 уровень сложности: 1) Есть абстрактный класс Переводчик, который имеет
// характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//         Реализовать данный класс и создать несколько классов различных
//         переводчиков с одного языка на другой.
//         Например с английского на русский, с русского на немецки и т.п.
//         Продумайте какова архитектура наследования будет в данном приложении.

public class ImplamentationTranslators {
    public static void main(String[] args) {
        EnglishToUkrainianTranslator englishToUkrainianTranslator;
        englishToUkrainianTranslator = new EnglishToUkrainianTranslator(
                "Boris", 30, "man", new String[]{"English", "Ukrainian"});

        englishToUkrainianTranslator.person();
        englishToUkrainianTranslator.translate();
        System.out.println("-----------------------------------------------");


        GermanToEnglishTranslator germanToEnglishTranslator;
        germanToEnglishTranslator = new GermanToEnglishTranslator(
                "Irina", 25, "woman", new String[]{"German", "English"});

        germanToEnglishTranslator.person();
        germanToEnglishTranslator.translate();
        System.out.println("-----------------------------------------------");


        GermanToUkrainianTranslator germanToUkrainianTranslator;
        germanToUkrainianTranslator = new GermanToUkrainianTranslator(
                "Aleksandr", 50, "man", new String[]{"German", "Ukrainian"});

        germanToUkrainianTranslator.person();
        germanToUkrainianTranslator.translate();
        System.out.println("-----------------------------------------------");


    }
    }
