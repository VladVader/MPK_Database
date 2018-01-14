import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.security.KeyFactory;
import java.util.Date;


@Entity
@PersistenceCapable
public class Pracownik {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String Imie;

    @Persistent
    private String pesel;

    @Persistent
    private String Nazwisko;

    @Persistent
    private DataUrodzenia;

    @Persistent
    private DataZatrudnienia;

    public Pracownik(String Imie, String Nazwisko, Date DataUrodzenia, Date DataZatrudnienia) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodzenia = DataUrodzenia;
        this.DataZatrudnienia = DataZatrudnienia;
    }

    // Accessors for the fields. JDO doesn't use these, but your application does.

    public Key getKey() {
        return key;
    }

    public String getImie() {
        return Imie;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        if(pesel.length()=11){
            this.pesel = pesel;
        }
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public Date getDataUrodzenia() {
        return DataUrodzenia;
    }

    public void setDataUrodzenia(Date DataUrodzenia) {
        if(getDataUrodzenia()<dataZatrudnienia){
            this.DataUrodzenia = DataUrodzenia;
        }
    }

    public addPracoenik(String Imie, String Nazwisko, Date DataUrodzenia, Date DataZatrudnienia) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodzenia = DataUrodzenia;
        this.DataZatrudnienia = DataZatrudnienia;


    }

    public Pracownik searchPracownik(String Imie) {
        Key k = KeyFactory.createKey(Pracownik.class.getSimpleName(), Imie);
        Pracownik p = pm.getObjectById(Pracownik.class, k);

        return p;
    }

}
