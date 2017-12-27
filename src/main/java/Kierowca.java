import java.util.Date;

@PersistenceCapable
public class Kierowca extends Pracownik{

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Set[String] kategorie;

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


    public Kontroler(String Imie, String Nazwisko, Date DataUrodzenia, Date DataZatrudnienia,Set[String] kategorie,Boolean stattus) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodzenia = DataUrodzenia;
        this.DataZatrudnienia = DataZatrudnienia;
        this.kategorie=kategorie;
        this.Status=stattus;
    }



}
