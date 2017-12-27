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

    public Int getNumer() {
        return numer;
    }

    @Persistent
    private Int liczbaMiejsc;

    @Persistent
    private String typ;

    @Persistent
    private Zajezdnia zajezdnia;

    public void setNumer(Int numer) {
        this.numer = numer;
    }

    public Data getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Data rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public Int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(Int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Zajezdnia getZajezdnia() {
        return zajezdnia;
    }

    public void setZajezdnia(Zajezdnia zajezdnia) {
        this.zajezdnia = zajezdnia;
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
