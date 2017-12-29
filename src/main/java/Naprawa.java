import java.util.Date;


@Entity
public class Naprawa {

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Date dataNaprawy;

    @Persistent
    private boolean planowana;

    @Persistent
    private boolean kapitalna;

    @Persistent
    private int kwotaNaprawy;

    @Persistent
    private Transport naprawionyTransport;

    @Persistent
    private Rozchod rozchod;

    public Naprawa(Date dataNaprawy, Boolean planowana, Boolean kapitalna, int kwotaNaprawy, Transport naprawionyTransport, Rozchod rozchod) {
        this.dataNaprawy = dataNaprawy;
        this.planowana = planowana;
        this.kapitalna = kapitalna;
        this.kwotaNaprawy = kwotaNaprawy;
        this.naprawionyTransport = naprawionyTransport;
        this.rozchod = rozchod;
    }

    public Date getDataNaprawy() {
        return dataNaprawy;
    }

    public void setDataNaprawy(Date dataNaprawy) {
        this.dataNaprawy = dataNaprawy;
    }

    public Boolean getPlanowana() {
        return planowana;
    }

    public void setPlanowana(Boolean planowana) {
        this.planowana = planowana;
    }

    public Boolean getKapitalna() {
        return kapitalna;
    }

    public void setKapitalna(Boolean kapitalna) {
        this.kapitalna = kapitalna;
    }

    public int getKwotaNaprawy() {
        return kwotaNaprawy;
    }

    public void setKwotaNaprawy(int kwotaNaprawy) {
        this.kwotaNaprawy = kwotaNaprawy;
    }

    public Transport getNaprawionyTransport() {
        return naprawionyTransport;
    }

    public void setNaprawionyTransport(Transport naprawionyTransport) {
        this.naprawionyTransport = naprawionyTransport;
    }

    public Rozchod getRozchod() {
        return rozchod;
    }

    public void setRozchod(Rozchod rozchod) {
        this.rozchod = rozchod;
    }

    public boolean deleteNaprawa(Naprawa naprawa) {
        pm.deletePersistent(naprawa);
    }

    public Naprawa[] naprawyTransportu(Transport transport) {
        Naprawa[] naprawy;

        for (pm.getObjects(Naprawa.class):naprawa
             ){
            if (naprawa.getTransportNaprawy().getNumer() == transport.getNumer()) {
                naprawy.add(naprawa);
            }
        }

        return naprawy;
    }
}
