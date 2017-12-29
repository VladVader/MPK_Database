import java.util.Date;


@Entity
PersistenceCapable

public class Pensja {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Int kwota;

    @Persistent
    private Pracownik osobaOtrzynujaca;

    @Persistent
    private Rozchod rozchod;

    @Persistent
    private Data DataOtrzymania;

    public Pensja(Int kwota, Pracownik pracownik, Date DataOtrymania, Rozchod rozchod, Int kwota) {
        this.kwota = kwota;
        this.osobaOtrzynujaca = pracownik;
        this.DataOtrzymania = DataOtrymania;
        this.rozchod = rozchod;
    }

    public Int getKwota() {
        return kwota;
    }

    public void setKwota(Int kwota) {
        this.kwota = kwota;
    }

    public Pracownik getOsobaOtrzynujaca() {
        return osobaOtrzynujaca;
    }

    public void setOsobaOtrzynujaca(Pracownik osobaOtrzynujaca) {
        this.osobaOtrzynujaca = osobaOtrzynujaca;
    }

    public Rozchod getRoachod() {
        return Roachod;
    }

    public void setRoachod(Rozchod roachod) {
        Roachod = roachod;
    }

    public Data getDataOtrzymania() {
        return DataOtrzymania;
    }

    public void setDataOtrzymania(Data dataOtrzymania) {
        DataOtrzymania = dataOtrzymania;
    }

    public Int SummaWszystkich() {
        int sum = 0;
        Pensje[] pensje = pm.getObjects(Pensja.class);
        for (Pensje:
             pensja
                ) {
            sum += pensja.getKwota
        }
        return sum;
    }


}
