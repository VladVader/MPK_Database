import java.sql.Time;
import java.util.ArrayList;


@Entity
public class Kurs {
    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Trasa trasaKursu;

    @Persistent
    private Kierowca kierowcaKursu;

    @Persistent
    private Transport transportKursu;

    @Persistent
    private Time czasPoczatku;

    @Persistent
    private boolean awaryjny;

    @Persistent
    private boolean powrot;

    @Persistent
    private boolean nocny;

    public Trasa getTrasaKursu() {
        return trasaKursu;
    }

    public void setTrasaKursu(Trasa trasaKursu) {
        this.trasaKursu = trasaKursu;
    }

    public Kierowca getKierowcaKursu() {
        return kierowcaKursu;
    }

    public void setKierowcaKursu(Kierowca kierowcaKursu) {
        this.kierowcaKursu = kierowcaKursu;
    }

    public Transport getTransportKursu() {
        return transportKursu;
    }

    public void setTransportKursu(Transport transportKursu) {
        this.transportKursu = transportKursu;
    }

    public Time getCzasPoczatku() {
        return czasPoczatku;
    }

    public void setCzasPoczatku(Time czasPoczatku) {
        this.czasPoczatku = czasPoczatku;
    }

    public boolean isAwaryjny() {
        return awaryjny;
    }

    public void setAwaryjny(boolean awaryjny) {
        this.awaryjny = awaryjny;
    }

    public boolean isPowrot() {
        return powrot;
    }

    public void setPowrot(boolean powrot) {
        this.powrot = powrot;
    }

    public boolean isNocny() {
        return nocny;
    }

    public void setNocny(boolean nocny) {
        this.nocny = nocny;
    }

    public Kurs(Trasa trasaKursu, Kierowca kierowcaKursu, Transport transportKursu, Time czasPoczatku, boolean awaryjny, boolean powrot, boolean nocny) {
        this.trasaKursu = trasaKursu;
        this.kierowcaKursu = kierowcaKursu;
        this.transportKursu = transportKursu;
        this.czasPoczatku = czasPoczatku;
        this.awaryjny = awaryjny;
        this.powrot = powrot;
        this.nocny = nocny;
    }


}
