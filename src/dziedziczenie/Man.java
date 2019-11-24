package dziedziczenie;

import obiektowosc.human;

public class Man extends human {
    private String plec;
    public Man (String name, String surname, Integer birthYear) {
        super (name, surname, birthYear);
        this.plec = "mezczyzna";
    }
    @Override
    public void przedstawSie() {
        super.przedstawSie();
        switch (this.sila) {
            case 1: System.out.println("Siła nie jest moja mocna strona"); break;
            case 2: System.out.println("Jestem wystarczajaco silny"); break;
            case 3: System.out.println("Jestem mega silny"); break;
        }
    }
}