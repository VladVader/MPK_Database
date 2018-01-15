
@Entity
public class Zajezdnia {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String nazwa;

    @Persistent
    private Adres adress;

    @Persistent
    private String telefon;

    @Persistent
    private Set<Transport> transportZajezdni;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {

        if (nazwa !=null)this.nazwa = nazwa;
    }

    public Adres getAdress() {
        return adress;
    }

    public void setAdress(Adres adress) {
        this.adress = adress;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        if (telefon != null)this.telefon = telefon;
    }


    public Zajezdnia(Key key, String nazwa, Adres adress, String telefon) {
        this.key = key;
        this.nazwa = nazwa;
        this.adress = adress;
        this.telefon = telefon;
    }

    public getTransportyZajezdni() {
        Transporty[] transporty;

        for ((pm.getObjects(Transport.class)):transport
             ){
            if (transport.getZajezdnia().getNazwa() = this.nazwa) {
                transporty.add(transport)
            }
        }

        return transporty;
    }


    public deleteFromZajezdnia(Transport transport) {
        transport.setZajednia = null;
    }
}
