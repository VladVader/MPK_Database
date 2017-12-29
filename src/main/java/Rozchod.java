


@Entity
public class Rozchod {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String tytul;

    @Persistent
    private int kwota;

    @Persistent
    private int kwartal;


    @Persistent
    private int rok;

    @Persistent
    private Bilans bilans;


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public int getKwartal() {
        return kwartal;
    }

    public void setKwartal(int kwartal) {
        this.kwartal = kwartal;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public Bilans getBilans() {
        return bilans;
    }

    public void setBilans(Bilans bilans) {
        this.bilans = bilans;
    }

    public Rozchod(String tytul, int kwota, int kwartal, int rok, Bilans bilans) {
        this.tytul = tytul;
        this.kwota = kwota;
        this.kwartal = kwartal;
        this.rok = rok;
        this.bilans = bilans;
    }


    public getAllNaprawy() {
        return pm.getObjects(Naprawa.class)
    }

    public getAllPensje() {
        return pm.getObjects(Pensja.class)
    }

    public getAllUrlopy() {
        return pm.getObjects(Urlop.class)
    }


    public obliczKwote() {
        int kwota = 0;
        for (pm.getObjects(Naprawa.class):naprawa
             ){
            kwota += naprawa.getKwota();
        }

        for (pm.getObjects(Pensja.class):pensja
             ){
            kwota += pensja.getKwota();
        }

        for (pm.getObjects(Urlop.class):urlop
             ){
            kwota += urlop.getKwota();
        }
    }

    return kwota;
}
