package obiektowosc;

import javax.print.DocFlavor;

public class human {
    //Atrybuty klasy
private String name;
private String surname;
private Integer birthYear;
private Integer age;
public Integer waga;
public Integer sila;

//Konstruktor - wywoływany jest przy inicjalizacji obiektu
    public human(String name, String surname, Integer birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
        this.waga = this.setWaga();
        this.sila = this.ocenSile();

    }

    //Slowka static - pozwala dostac sie do tej funkcji bez inicjalizacji obiektu
    //nie mozemy operowac w niej na zadnych atrybutach/metodach niestatycznych

    public static void opiszKlase(){
        System.out.println("Klasa human oblicza wiek i umozliwia przedstawienie sie obiektu");
    }
    
        //metody klasy
        private Integer obliczWiek (){
            Integer actualYear = 2019;
            return actualYear - this.birthYear;
        }

        public void przedstawSie (){
            System.out.println("Hej, Nazywam sie " + this.name + " " + this.surname);
            System.out.println("Mam " + this.age + " lat.");
        }

        //Metody settery i gettery
    //Getter


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Setter
    public void setBirthYear(Integer birthYear){
    this.birthYear = birthYear;
    this.age = this.obliczWiek();
    }

    public void setWaga(Integer waga){
        this.waga = waga;
    }

    public Integer ocenSile(){
        if(this.waga < 45)
        this.sila = 1;
        else if (this.waga <=90)
        this.sila = 2;
        else
            this.sila=3;
    }



}
