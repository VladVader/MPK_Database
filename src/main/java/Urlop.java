
@Entity
public class Urlop {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private Data dataKonca;

    @OneToMany(orphanRemoval=true)
    @ForeignKey
    @Persistent
    private Pracownik osobaNaUrlopie;

    @Persistent
    private int kwota;


    @ForeignKey
    @Persistent
    private Rozchod rozchod;

    @Persistent
    private Data dataPoczatku;


    public Data getDataPoczatku() {
        return dataPoczatku;
    }

    public void setDataPoczatku(Data dataPoczatku) {

        if(dataPoczatku<dataKonca)this.dataPoczatku = dataPoczatku;
    }

    public Data getDataKonca() {
        return dataKonca;
    }

    public void setDataKonca(Data dataKonca) {

        if(dataKonca>dataPoczatku)this.dataKonca = dataKonca;
    }

    public Pracownik getOsobaNaUrlopie() {
        return osobaNaUrlopie;
    }

    public void setOsobaNaUrlopie(Pracownik osobaNaUrlopie) {
        this.osobaNaUrlopie = osobaNaUrlopie;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {

        if (kwota>0)this.kwota = kwota;
    }

    public Rozchod getRozchod() {
        return rozchod;
    }

    public void setRozchod(Rozchod rozchod) {
        this.rozchod = rozchod;
    }

    public Urlop(Data dataPoczatku, Data dataKonca, Pracownik osobaNaUrlopie, int kwota, Rozchod rozchod) {
        this.dataPoczatku = dataPoczatku;
        this.dataKonca = dataKonca;
        this.osobaNaUrlopie = osobaNaUrlopie;
        this.kwota = kwota;
        this.rozchod = rozchod;
    }


    public Urlopy[] getUrlopyPracownika(Pracownik pracownik) {
        Urlop[] urlopyPracownika;

        for ((pm.getObjects(Urlopy.class)):urlop
            ){
            if (urlop.getOsobaNaUrlopie().pesel == pracownik.getPesel()) {
                urlopyPracownika.add(urlop)
            }
        }

        return urlopyPracownika;
    }

}
