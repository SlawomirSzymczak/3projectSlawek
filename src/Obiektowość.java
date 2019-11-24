import dziedziczenie.Man;
import dziedziczenie.Woman;
import obiektowosc.Car;
import obiektowosc.human;

public class Obiektowość {
    public static void main(String[] args) {

        human.opiszKlase();

        human czlowiek1 = new human("Kasia", "Nowakowska", 1991);
        //Metoda przedstawSie jest dostepna, bo jest public
        czlowiek1.przedstawSie();
        //Atrybut name oraz funkcja oblicz wiek nie są dostępne poza klasą human
        //bo są private

        human czlowiek2 = new human("Robert", "Kowalski", 1985);
        czlowiek2.przedstawSie();

        human czlowiek3 = new human("Gosia", "Majewska", 1959);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + czlowiek3.getSurname());
        czlowiek3.setBirthYear(1975);
        czlowiek3.przedstawSie();


//2 obiekty klasy Car
        Car Kia = new Car("Kia", "Ceed", 2011);
        Kia.przyspiesz(60);
        Kia.opiszAuto();

        Car Skoda = new Car("Skoda", "Fabia", 2017);
        Skoda.przyspiesz(152);
        Skoda.opiszAuto();

    // Obiekt klasy Woman dziedziczącej po Human
    Woman kobieta1 = new Woman("Kasia", "Kowalska", 2007);
    kobieta1.przedstawSie();
    kobieta1.setBirthYear(2009);
    kobieta1.getName();

    Man mezczyzna1 = new Man("Tomek", "Gorny", 1998);
            mezczyzna1.setWaga(70);
            mezczyzna1.ocenSile();
            mezczyzna1.przedstawSie();
}
}

