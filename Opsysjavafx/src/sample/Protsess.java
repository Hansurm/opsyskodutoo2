package sample;

public class Protsess {
    private String nimi;
    private int malumaht;
    private int kestus;


    public Protsess(String nimi, int malumaht, int kestus) {
        this.nimi = nimi;
        this.malumaht = malumaht;
        this.kestus = kestus;
    }

    public int getMalumaht() {
        return malumaht;
    }

    public void setMalumaht(int malumaht) {
        this.malumaht = malumaht;
    }

    public int getKestus() {
        return kestus;
    }

    public void setKestus(int kestus) {
        this.kestus = kestus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
