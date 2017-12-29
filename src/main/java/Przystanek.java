import java.util.Set;


@Entity
public class Przystanek {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String nazwa;

    @Persistent
    private String ulica;

    @Persistent
    private String rodzaj;

    @Persistent
    private boolean aktywny;

    public Przystanek(String nazwa, String ulica, String rodzaj, boolean aktywny) {
        this.nazwa = nazwa;
        this.ulica = ulica;
        this.rodzaj = rodzaj;
        this.aktywny = aktywny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }

    public Trasa[] getTrasyWhereUse() {
        Trasa[] trasy;

        for ((pm.getObjects(Trasa.class)):trasa
             ){
            if (trasa.getPrzystanki().contains(this.Przystanek)) {
                trasy.add(trasa)
            }
        }

        return trasy;
    }
}
