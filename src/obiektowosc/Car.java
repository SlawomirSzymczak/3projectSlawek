package obiektowosc;

public class Car<zmiana> {
    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer predkosc;
    private Integer age;

    public Car(String marka, String model, Integer rokprodukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokprodukcji;
        this.age = this.obliczWiek();
        this.predkosc = 0;
    }
        private Integer obliczWiek (){
            Integer actualYear=2019;
            return actualYear - rokProdukcji;
        }

    public Integer przyspiesz(Integer zmiana) {
        this.predkosc += zmiana;
        System.out.println("Twoja aktualna predkosc to: " + this.predkosc);
        return this.predkosc;
    }

    public void opiszAuto(){
        System.out.println("Oto " + this.marka + " " + this.model);
        if(this.age < 5){
            System.out.println("Nowe auto prawie nie używane");
    }else if (this.age <= 20) {
            System.out.println("Trochę już jeździ, ale jeszcze działa");
        }else {
            System.out.println("Nadaje się tylko na złom");
        }
    }
}
