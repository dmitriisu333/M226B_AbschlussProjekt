package ch.bbw.ds.abschlussprojekt;

/**
 * @Autor Dmitrii Subeichin
 * @Version 28.06.22
 */


public class Lernzimmer {
    private Long lernzimmerID;
    private int lernzimmerNummer;
    private int anzahlSitzplaetze;
    private int anzahlTafel;
    private int anzahlProjektoren;
    private int anzahlDrucker;

    public Lernzimmer(Long lernzimmerID, int lernzimmerNummer, int anzahlSitzplaetze, int anzahlTafel, int anzahlProjektoren, int anzahlDrucker) {
        this.lernzimmerID = lernzimmerID;
        this.lernzimmerNummer = lernzimmerNummer;
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.anzahlTafel = anzahlTafel;
        this.anzahlProjektoren = anzahlProjektoren;
        this.anzahlDrucker = anzahlDrucker;
    }

    public Long getLernzimmerID() {
        return lernzimmerID;
    }

    public void setLernzimmerID(Long lernzimmerID) {
        this.lernzimmerID = lernzimmerID;
    }

    public int getLernzimmerNummer() {
        return lernzimmerNummer;
    }

    public void setLernzimmerNummer(int lernzimmerNummer) {
        this.lernzimmerNummer = lernzimmerNummer;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    public int getAnzahlTafel() {
        return anzahlTafel;
    }

    public void setAnzahlTafel(int anzahlTafel) {
        this.anzahlTafel = anzahlTafel;
    }

    public int getAnzahlProjektoren() {
        return anzahlProjektoren;
    }

    public void setAnzahlProjektoren(int anzahlProjektoren) {
        this.anzahlProjektoren = anzahlProjektoren;
    }

    public int getAnzahlDrucker() {
        return anzahlDrucker;
    }

    public void setAnzahlDrucker(int anzahlDrucker) {
        this.anzahlDrucker = anzahlDrucker;
    }

    @Override
    public String toString() {
        return "Lernzimmer{" +
                "lernzimmerID=" + lernzimmerID +
                ", lernzimmerNummer=" + lernzimmerNummer +
                ", anzahlSitzplaetze=" + anzahlSitzplaetze +
                ", anzahlTafel=" + anzahlTafel +
                ", anzahlProjektoren=" + anzahlProjektoren +
                ", anzahlDrucker=" + anzahlDrucker +
                '}';
    }
}
