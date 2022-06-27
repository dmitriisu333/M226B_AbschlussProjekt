package ch.bbw.ds.abschlussprojekt;

public class Addresse {

    private int hausnummer;
    private String strasse;
    private String stadt;
    private String zip;
    private String kanton;

    public Addresse(int hausnummer, String strasse, String stadt, String zip, String kanton) {
        this.hausnummer = hausnummer;
        this.strasse = strasse;
        this.stadt = stadt;
        this.zip = zip;
        this.kanton = kanton;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getKanton() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton = kanton;
    }

    @Override
    public String toString() {
        return "Addresse{" +
                "hausnummer=" + hausnummer +
                ", strasse='" + strasse + '\'' +
                ", stadt='" + stadt + '\'' +
                ", zip='" + zip + '\'' +
                ", kanton='" + kanton + '\'' +
                '}';
    }
}
