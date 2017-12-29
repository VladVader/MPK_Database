import java.util.Date;



@Entity
@PersistenceCapable
public class Bilans {

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private int kwartal;

    @Persistent
    private int rok;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
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

    public Boolean getRozliczenie() {
        return rozliczenie;
    }

    public void setRozliczenie(Boolean rozliczenie) {
        this.rozliczenie = rozliczenie;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    @Persistent
    private Boolean rozliczenie;

    @Persistent
    private int kwota;


    public Bilans(Key key, int kwartal, int rok, Boolean rozliczenie, int kwota) {
        this.key = key;
        this.kwartal = kwartal;
        this.rok = rok;
        this.rozliczenie = rozliczenie;
        this.kwota = kwota;
    }

    public int obliczBilans() {
        kwotaBilansu = 0;
        Przychod[] przychody = pm.getObjects(Przychod.class);
        Rozchody[] rozchody = pm.getObjects(Rozchod.class);

        for (przychody:
             przychod) {
            kwotaBilansu += przychod.getKwota();
        }

        for (rozchody:
             rozchod) {
            kwotaBilansu -= rozchod.getKwota();
        }

        return kwotaBilansu;
    }

    public Bilans[] getAllBilansy() {
        Bilansy[] bilansy = pm.getObjects(Bilans.class);
        return bilansy;
    }
}

