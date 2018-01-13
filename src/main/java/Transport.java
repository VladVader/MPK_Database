
@Entity
public class Transport {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Int numer;

    @Persistent
    private Data rokProdukcji;

    @Persistent
    private String producent;

    @OneToMany(orphanRemoval=true)
    @ForeignKey
    @Persistent
    private Naprawa[] naprawTransportu;

    public Int getNumer() {
        return numer;
    }

    @Persistent
    private Int liczbaMiejsc;

    public Transport[] getKursyTransportu() {
        return kursyTransportu;
    }

    public void setKursyTransportu(Transport[] kursyTransportu) {
        if(kursyTransportu.length>0) this.kursyTransportu = kursyTransportu;
    }

    @OneToMany(orphanRemoval=true)
    @ForeignKey
    @Persistent
    private Kurs[] kursyTransportu;

    @Persistent
    private String typ;


    @ForeignKey
    @Persistent
    private Zajezdnia zajezdnia;

    public void setNumer(Int numer) {
        if(numer != null)this.numer = numer;
    }

    public Naprawa[] getNaprawTransportu() {
        return naprawTransportu;
    }

    public void setNaprawTransportu(Naprawa[] naprawTransportu) {
       if(naprawTransportu != null && naprawTransportu.length >0) this.naprawTransportu = naprawTransportu;
    }

    public Data getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Data rokProdukcji) {
        if(rokProdukcji>1995)this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        if(producent !=null)this.producent = producent;
    }

    public Int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(Int liczbaMiejsc) {
        if(liczbaMiejsc >0)this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        if(typ != null)this.typ = typ;
    }

    public Zajezdnia getZajezdnia() {
        return zajezdnia;
    }

    public void setZajezdnia(Zajezdnia zajezdnia) {
        if(zajezdnia != null)this.zajezdnia = zajezdnia;
    }


    public Transport(Int numer, Data rokProdukcji, String producent, Int liczbaMiejsc, String typ, Zajezdnia zajezdnia) {
        this.numer = numer;
        this.rokProdukcji = rokProdukcji;
        this.producent = producent;
        this.liczbaMiejsc = liczbaMiejsc;
        this.typ = typ;
        this.zajezdnia = zajezdnia;
    }

    public Transport searchTransport(Int numer) {
        for ((pm.getObjects(Transport.class):transport)
             ){
            if (transport.getNumer() == numer) {
                return transport;
            }
        }
    }


    public Boolean deleteTransport(Transport transport) {
        pm.deletePersistent(transport);
    }

}
