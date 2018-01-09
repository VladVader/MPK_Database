
@Entity
@PersistenceCapable
public class Kierowca extends Pracownik {

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Set[] kategorie;

    public Set[] getKursyKierowcy() {
        return kursyKierowcy;
    }

    public void setKursyKierowcy(Set[] kursyKierowcy) {
        if(kursyKierowcy !-null && kursyKierowcy.length >0)this.kursyKierowcy = kursyKierowcy;
    }

    @Persistent
    private Set[]kursyKierowcy;

    @Persistent
    private String grafik;

    public Set[] getKategorie() {
        return kategorie;
    }

    public void setKategorie(Set[] kategorie) {
        if (kategorie != null) this.kategorie = kategorie;
    }

    public int getCzasPracy() {
        return czasPracy;
    }

    public void setCzasPracy(int czasPracy) {
        if (czasPracy >= 0) this.czasPracy = czasPracy;
    }

    @Persistent
    private int czasPracy;

    @Override
    public Key getKey() {
        if (key != null) return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        if (status.getClass() == boolean)Status = status;
    }


    @Persistent
    private Boolean Status;


    public Kontroler(String Imie, String Nazwisko, Date DataUrodzenia, Date DataZatrudnienia, Set[String]kategorie, Boolean stattus) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodzenia = DataUrodzenia;
        this.DataZatrudnienia = DataZatrudnienia;
        this.kategorie = kategorie;
        this.Status = stattus;
    }


    public Set[] getKategorieKierowcy() {
        return this.kategorie;
    }

    public int obliczWyplate() {
        if(this.czasPracy>=0) {
            return (this.czasPracy * 20);
        }
    }

    public void przygotujGrafik(){
        if(this.czasPracy <160){
            grafik.add(kursyKierowcy)
        }
    }


}
