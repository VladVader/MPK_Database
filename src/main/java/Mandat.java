import java.util.Date;

@Entity
public class Mandat {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Date data;

    @Persistent
    private boolean zaplacony;


    @Persistent
    private Przychod przychod;

    @Persistent
    private int kwota;

    public Mandat(Date data, boolean zaplacony, Przychod przychod, int kwota) {
        this.data = data;
        this.zaplacony = zaplacony;
        this.przychod = przychod;
        this.kwota = kwota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isZaplacony() {
        return zaplacony;
    }

    public void setZaplacony(boolean zaplacony) {
        this.zaplacony = zaplacony;
    }

    public Przychod getPrzychod() {
        return przychod;
    }

    public void setPrzychod(Przychod przychod) {
        this.przychod = przychod;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public Mandat[] getAllMandats(){
        return pm.getObjects(Mandat.class);
    }



}
