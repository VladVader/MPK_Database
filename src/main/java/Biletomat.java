import java.util.Date;

public class Biletomat {

    @PrimaryKey
    @Persistynt(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Date dataMontazu;

    @Persistent
    private Przystanek Przystanek_montazu;

    @Persistent
    private boolean sparwny;

    @Persistent
    private String model;

    public Biletomat(Date dataMontazu, Przystanek przystanek_montazu, boolean sparwny, String model) {
        this.dataMontazu = dataMontazu;
        Przystanek_montazu = przystanek_montazu;
        this.sparwny = sparwny;
        this.model = model;
    }

    public Date getDataMontazu() {
        return dataMontazu;
    }

    public void setDataMontazu(Date dataMontazu) {
        this.dataMontazu = dataMontazu;
    }

    public Przystanek getPrzystanek_montazu() {
        return Przystanek_montazu;
    }

    public void setPrzystanek_montazu(Przystanek przystanek_montazu) {
        Przystanek_montazu = przystanek_montazu;
    }

    public boolean isSparwny() {
        return sparwny;
    }

    public void setSparwny(boolean sparwny) {
        this.sparwny = sparwny;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Bilet[] getAllsaledBilets(){
        Bilet [] bilety;
        for ((pm.getObjects(Bilet.class)):bilet
             ) {
            if(bilet.getBiletomat()=this.Biletomat){
                bilety.add(bilet)
            }
        }

        return bilety;
    }
}
