package ch.bbw.ds.abschlussprojekt;

public class Lehrer extends Person {
    private int lohn;
    private int lohnVerdient;

    public Lehrer(Long id, String name, String vorname, int alter,
                  String geschlecht, String email, String telefonnummer,
                  Addresse adresse, int lohn) {
        super(id, name, vorname, alter, geschlecht, email, telefonnummer, adresse);
        this.lohn = lohn;
        this.lohnVerdient = 0;
    }

    public void lohnBekommen(int lohn) {
        lohnVerdient += lohn;
    }

    public int getLohn() {
        return lohn;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }

    @Override
    public String toString() {
        return "Lehrer{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", alter=" + alter +
                ", geschlecht='" + geschlecht + '\'' +
                ", email='" + email + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", adresse=" + adresse +
                "lohn=" + lohn +
                ", lohnVerdient=" + lohnVerdient
                + '}'
                ;
    }
}
