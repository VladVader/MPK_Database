import java.sql.Time;
import java.util.Date;

@Entity
public class Bilet {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String rodzaj;

    @Persistent
    private Boolean ulga;

    @Persistent
    private boolean zaplacony;


    @Persistent
    private int cena;

    @Persistent
    private Date waznyDo;


    @Persistent
    private Przychod przychod;

    @Persistent
    private Biletomat biletomat;

    public Bilet(String rodzaj, Boolean ulga, boolean zaplacony, int cena, Date waznyDo, Przychod przychod, Biletomat biletomat) {
        this.rodzaj = rodzaj;
        this.ulga = ulga;
        this.zaplacony = zaplacony;
        this.cena = cena;
        this.waznyDo = waznyDo;
        this.przychod = przychod;
        this.biletomat = biletomat;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public Boolean getUlga() {
        return ulga;
    }

    public void setUlga(Boolean ulga) {
        this.ulga = ulga;
    }

    public boolean isZaplacony() {
        return zaplacony;
    }

    public void setZaplacony(boolean zaplacony) {
        this.zaplacony = zaplacony;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Date getWaznyDo() {
        return waznyDo;
    }

    public void setWaznyDo(Date waznyDo) {
        this.waznyDo = waznyDo;
    }

    public Przychod getPrzychod() {
        return przychod;
    }

    public void setPrzychod(Przychod przychod) {
        this.przychod = przychod;
    }

    public Biletomat getBiletomat() {
        return biletomat;
    }

    public void setBiletomat(Biletomat biletomat) {
        this.biletomat = biletomat;
    }


    public int getSum() {
        int kwota = 0;
        for (pm.getObjects(Bilet.class):bilet
             ){
            kwota += bilet.getCena();
        }

        return kwota;
    }

    public Bilet[] getAktywne() {
        Bilet [] bilety=[];
        for (pm.getObjects(Bilet.class):bilet
             ){
            if(bilet.getWaznyDo()< Time);
            bilety.add(bilet);
        }

        return bilety;
    }

}
