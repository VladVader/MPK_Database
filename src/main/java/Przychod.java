


@Entity
public class Przychod {
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

    @OneToMany(orphanRemoval=true)
    @ForeignKey
    @Persistent
    private Bilans bilans;

    public Przychod(String tytul, int kwota, int kwartal, int rok, Bilans bilans) {
        this.tytul = tytul;
        this.kwota = kwota;
        this.kwartal = kwartal;
        this.rok = rok;
        this.bilans = bilans;
    }

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
        if(kwota>0){
            this.kwota = kwota;
        }
    }

    public int getKwartal() {
        return kwartal;
    }

    public void setKwartal(int kwartal) {
        if(kwartal<5){
            this.kwartal = kwartal;
        }

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

        if(bilans !=null)this.bilans = bilans;
    }

    public getAllBilety() {
        return pm.getObjects(Naprawa.class)
    }

    public getAllMandaty() {
        return pm.getObjects(Pensja.class)
    }


    public obliczKwote() {
        int kwota = 0;
        for (pm.getObjects(Bilet.class):bilet
             ){
            kwota += bilet.getKwota();
        }

        for (pm.getObjects(Mandat.class):mandat
             ){
            kwota += mandat.getKwota();
        }

        this.kwota=kwota;
    }


}


