import java.util.Date;


@Entity
@PersistenceCapable
public class Kontroler extends Pracownik {

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Int numerTerminaluKontroli;

    @Override
    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    @Persistent
    private Boolean Status;


    public Kontroler(String Imie, String Nazwisko, Date DataUrodzenia, Date DataZatrudnienia, Int numerTerminalu, Boolean stattus) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodzenia = DataUrodzenia;
        this.DataZatrudnienia = DataZatrudnienia;
        this.numerTerminaluKontroli = numerTerminalu;
        this.Status = stattus;
    }

    public Int getNumerTerminaluKontroli() {
        return numerTerminaluKontroli;
    }

    public void setNumerTerminaluKontroli(Int numerTerminaluKontroli) {
        this.numerTerminaluKontroli = numerTerminaluKontroli;
    }


}

