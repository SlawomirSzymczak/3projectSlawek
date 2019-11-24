package dziedziczenie;

import obiektowosc.human;

public class Woman extends human {

    private String plec;

    public Woman(String name, String surname, Integer birthYear){
        super(name, surname, birthYear);
        this.plec = "kobieta";
    }

    //Nadpisywanie metod - zmiana działania nadpisanej metody
    @Override
    public void przedstawSie () {
        super.przedstawSie();
        System.out.println("Jestem " + this.plec);
    }
}
