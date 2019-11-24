import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static String zwrocImie (Integer case1) {
        //Integer case1 = 5;
        String imię = "";
        switch (case1) {
            case 1: imię = "Kasia"; break;
            case 5: imię = "Tomek"; break;
            case 8: imię = "Dawid"; break;
            default: imię = "NoName";
        }
        return imię;
    }
    public static void przedstawSie (String imię){
        System.out.println("Moje imię to " + imię);
    }
//Wpisujemy main
    //Funkcja egzekucyjna
public static void main (String [] args) {
    String imię = zwrocImie( 5);
    przedstawSie(imię);
    imię = zwrocImie( 1);
    przedstawSie(imię);
    przedstawSie(zwrocImie(10));

        System.out.println("Hej, moj pierwszy program");
        System.out.println("Hej, pisze drugi raz!");
        //zmienne
        // definicja typu (String), nazwa zmiennej (napis1) + opcjonalnie przydzielenie wartosci
        String napis1 = "Katarzyna Nowakowska";
        // Boolean - typ logiczny, zwraca true lub false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.println(isTomek);
        //Integer - typ numeryczny liczb calkowitych, Integer to klasa wrapujaca typ prsty ins (daje metody ulatwiajace prece z danym typem)
        Integer liczba1 = 2;
        // Long - liczba całkowita, ale duzo dluzsza
        Long liczba2 = Long.valueOf(1302);
        liczba1.equals(liczba2);
        //Float - typ numeryczny zmiennoprzecinkowy
        double ulamek1 = 10.55;
        //Double - zmiennoprzecinkowa, inny zakres, większy zakres
        Double ulamek2 = 10.5;
        // kolekcje
        //Lista = zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());

        //Hashmap - słownik trzymający pary klucz-wartość
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        System.out.println(mapa1.toString());
        //Pair - słownik tylka jedna para klucz wartosc
        Pair<String, Integer> pair = new Pair<>("Kasia", 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue().toString();
        System.out.println(napis2);
        //CTRL + SHIFT + F10 - odpalenie aktualnej konfiguracji

        //Pętle
        //Pętla for
        //Warunek początkowy (wartość początkowa licznika;
        // warunek końcowy (wartość końcowa licznika;
        // modyfikator licznika i++ oznacza, że i będzie większe o 1 po przejściu pętli
        for (Integer i = 0; i <= 5; i++) {
            System.out.println("Wartość licznika: " + i.toString());
        }
        Integer i = 0;
        while (i < 5) {
            System.out.println("Jestem w while po raz " + i.toString());
            i++;
        }

        //Break to specjalne słowo, które pozwala zakończyć działanie pętli
        while (true) {
            i++;
            if (i.equals(7))
                continue;
            System.out.println(" " + i.toString());
            if (i == 10)
                break;
        }

        do {
            System.out.println("Jestem w do while");
            i++;
        } while (i < 10);

        //Pętla for each na liście
        for (String el : lista1) {
            System.out.println("Element listy: " + el);
        }

        //Pętla for each na mapie #TODO
        //for(String el: mapa1) ()

        //Insturkcje warunkowe
        // Instrukcja if..else if...else
        //Else się zawsze wykona, kiedy warunek nie jest spełniony
        if (lista1.size() == 3) {
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }
        if (lista1.size() < 1) {
            System.out.println("Z tym warunkiem nigdy się nie wypisze");
        } else {
            System.out.println("Jestem w instrukcji else");
        }
        if (lista1.size() < 1) {
            System.out.println("Nie wykona się");
        } else if (lista1.size() == 2) {
            System.out.println("Ja się wykonam");
        } else {
            System.out.println("Ja sie już nie wykonam, bo warunek jest spełniony");
        }

        //Instrukcja warunkowa switch case - na końcu każdego case musi znaleźć się słówko break

        i=2;
        String message = "Moje imie to";
        switch (i) {
            case 2: message += "Kasia"; break;
            case 5: message += "Tomek"; break;
            case 8: message += "Dawid"; break;
        }
        System.out.println(message);
    }
}



