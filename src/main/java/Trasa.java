import java.util.ArrayList;


@Entity
public class Trasa {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String nazwa;

    @Persistent
    private ArrayList<Przystanek> przystankiTrasy;

    @Persistent
    private ArrayList<Time> odstepyCzasowe;

    @Persistent
    private ArrayList<Time> czasyPrzyjazdow;

    @Persistent
    private ArrayList<Time> czasyOdjazdow;

    public Trasa(String nazwa, ArrayList<Przystanek> przystankiTrasy, ArrayList<Time> odstepyCzasowe, ArrayList<Time> czasyPrzyjazdow, ArrayList<Time> czasyOdjazdow) {
        this.nazwa = nazwa;
        this.przystankiTrasy = przystankiTrasy;
        this.odstepyCzasowe = odstepyCzasowe;
        this.czasyPrzyjazdow = czasyPrzyjazdow;
        this.czasyOdjazdow = czasyOdjazdow;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ArrayList<Przystanek> getPrzystankiTrasy() {
        return przystankiTrasy;
    }

    public void setPrzystankiTrasy(ArrayList<Przystanek> przystankiTrasy) {
        this.przystankiTrasy = przystankiTrasy;
    }

    public ArrayList<Time> getOdstepyCzasowe() {
        return odstepyCzasowe;
    }

    public void setOdstepyCzasowe(ArrayList<Time> odstepyCzasowe) {
        this.odstepyCzasowe = odstepyCzasowe;
    }

    public ArrayList<Time> getCzasyPrzyjazdow() {
        return czasyPrzyjazdow;
    }

    public void setCzasyPrzyjazdow(ArrayList<Time> czasyPrzyjazdow) {
        this.czasyPrzyjazdow = czasyPrzyjazdow;
    }

    public ArrayList<Time> getCzasyOdjazdow() {
        return czasyOdjazdow;
    }

    public void setCzasyOdjazdow(ArrayList<Time> czasyOdjazdow) {
        this.czasyOdjazdow = czasyOdjazdow;
    }

    public boolean usePrzystanek(Przystanek przystanek) {
        return this.przystankiTrasy.contains(przystanek);
    }

    public Time getCzasOdjazduPrzystanku(String nazwa){
        int numer=this.przystankiTrasy.indexOf(nazwa);
       return this.czasyOdjazdow.get(numer);
    }
    public Time getCzasPrzyjazduPrzystanku(String nazwa){
        int numer=this.przystankiTrasy.indexOf(nazwa);
        return this.czasyPrzyjazdow.get(numer);
    }
    public Time getCzasDoNastepnego(String nazwa){
        int numer=this.przystankiTrasy.indexOf(nazwa);
        return this.odstepyCzasowe.get(numer);
    }
}
